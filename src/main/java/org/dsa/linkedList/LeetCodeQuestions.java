package org.dsa.linkedList;

public class LeetCodeQuestions {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);


        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        System.out.println("given LL");
        LeetCodeQuestions llObj = new LeetCodeQuestions();
        llObj.printList(head1);
        //System.out.println("remove 2nd NodeFromEndOfList");


        //llObj.printList(llObj.removeNthNodeFromEndOfList(head1, 2));
        System.out.println("reverse linkedList");
        llObj.printList(llObj.reverseList(head1));

    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
    ListNode removeNthNodeFromEndOfList(ListNode head, int pos) {


        if (head == null) {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == 1) {
            return head.next;
        }
        int deletePos = size - pos;
        ListNode temp1 = head;
        for (int i = 0; i < deletePos - 1; i++) {

            if (temp1 == null) {
                return head;
            }
            temp1 = temp1.next;
        }

        ListNode ln = temp1.next.next;
        temp1.next = ln;
        return head;

    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
    ListNode reverseList(ListNode head) {


        if (head == null || head.next == null)
            return head;

        // Reverse the rest of the list
        ListNode revHead = reverseList(head.next);

        // Make the current head the last node
        head.next.next = head;

        // Update the next of current head to NULL
        head.next = null;

        // Return the new head of the reversed list
        return revHead;
    }
}
