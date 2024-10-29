package org.dsa.recursion;


public class RecursionLinkedListOperations {
    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        RecursionLinkedListOperations obj=new RecursionLinkedListOperations();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Given Linked List:");
        printList(head1);

        head1 = obj.reverseList(head1);

        System.out.print("\nreversed Linked List:");
        printList(head1);
    }


    // This function prints the contents
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
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
