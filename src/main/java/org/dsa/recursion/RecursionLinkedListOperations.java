package org.dsa.recursion;


public class RecursionLinkedListOperations {
    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Given Linked List:");
        printList(head1);

//        head1 = reverseLinkedList(head1);

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

    static boolean isPalindronByRecursion(ListNode head){
        return false;
    }
}
