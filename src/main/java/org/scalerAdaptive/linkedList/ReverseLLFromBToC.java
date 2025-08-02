package org.scalerAdaptive.linkedList;

public class ReverseLLFromBToC {
    static ListNode head;

    {
        // Example usage
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
    }

    public static void main(String[] args) {
        ReverseLLFromBToC obj = new ReverseLLFromBToC();
        //obj.printLinkedList(obj.copyList(head));
        obj.printLinkedList(obj.reverseBetween(head, 2, 4));
    }

    private ListNode copyList(ListNode original) {
        if (original == null) {
            return null; // Return null if the original list is empty
        }

        ListNode newHead = new ListNode(original.val); // Create the head of the new list
        ListNode currentOriginal = original.next;
        ListNode currentNew = newHead;

        while (currentOriginal != null) {
            currentNew.next = new ListNode(currentOriginal.val); // Copy each node
            currentNew = currentNew.next;
            currentOriginal = currentOriginal.next;
        }

        return newHead; // Return the head of the copied list
    }

    private ListNode reverseBetween(ListNode myhead, int B, int C) {
        // Implementation of the reverse logic
        if (myhead == null || B >= C) {
            return myhead; // No need to reverse if the list is empty or B >= C
        }

        ListNode dummy = new ListNode(0);
        ListNode dummyNew = dummy;

        ListNode curr = myhead;
        ListNode remaining = new ListNode(0);
        while (curr != null) {
            if (B == 1 && C >= 1) {
                dummyNew.next = curr;
                dummyNew = dummyNew.next;
                curr = curr.next;
                C--;
                B = 1;
            } else if (C > 1) {
                curr = curr.next;
                B--;
                C--;
            } else {
                remaining.next = curr;
                remaining = remaining.next;
                break;
            }

        }
        dummyNew.next = null;
        dummyNew = dummyNew.next;

        ListNode reverseHead = reverseList(dummy.next);
        printLinkedList(reverseHead);
        ListNode result = new ListNode(0);
        ListNode resultTemp = result;
        resultTemp.next = reverseHead;
        resultTemp = resultTemp.next;
        //result = result.next;
        // Now we need to connect the remaining  part with the remaining part

        while (resultTemp.next != null) {

            resultTemp = resultTemp.next;
        }
        resultTemp.next = remaining.next;
        resultTemp = resultTemp.next;

        return result; // Placeholder return
    }

    private ListNode reverseList(ListNode rev) {
        System.out.println("print before reversing");
        printLinkedList(rev);
        System.out.println("reversing the linked list is done");
        ListNode curr = rev;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;


    }

    private void printLinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}
