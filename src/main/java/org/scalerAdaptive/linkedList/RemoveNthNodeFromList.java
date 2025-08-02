package org.scalerAdaptive.linkedList;

import org.dsa.linkedList.BasicOperationOfLL;

public class RemoveNthNodeFromList {
    static ListNode head;

    {
        // Example usage
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


    }

    public static void main(String[] args) {
        int n = 1; // Remove the 2nd node from the end
        RemoveNthNodeFromList obj = new RemoveNthNodeFromList();
        ListNode updatedHead = obj.removeNthFromEnd(head, n);
        RemoveNthNodeFromList.printList(updatedHead);
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }

    public ListNode removeNthFromEnd(ListNode head, int idx) {

        //using fast and slow pointer

        ListNode slow = head;
        ListNode fast = head;

        // fast pointer will be n time next with slow pointer
        for (int i = 1; i <= idx; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                break;
            }
        }


        ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (idx == 1) {

            // if we want to remove the last node
            if (prev != null) {
                prev.next = slow;
            } else {
                return null; // if there is only one node
            }
          
        }
        if (prev != null) {

            // remove the slow node
            return prev.next = slow.next;
        } else {
            return head.next;
        }

    }
}