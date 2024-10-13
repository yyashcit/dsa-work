package org.dsa.linkedList;


import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }

    public Node() {
    }
}

public class MergeSortedLinkedList {

    // Function to reverse the linked list
    public static Node mergeTwoLists(Node list1, Node list2) {

        Node resultLL = new Node();

        Node headNode = resultLL;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                resultLL.next = list1;
                list1 = list1.next;
            } else {
                resultLL.next = list2;
                list2 = list2.next;
            }
            resultLL = resultLL.next;
        }

        if (list1 == null) {
            resultLL.next = list2;
        }
        if (list2 == null) {
            resultLL.next = list1;
        }

        return headNode.next;
    }

    // This function prints the contents
    // of the linked list starting from the head
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);


        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        //head2.next.next.next = new Node(4);
        //head.next.next.next.next = new Node(5);

        System.out.print("Given Linked List:");
        printList(head1);

        head1 = mergeTwoLists(head1, head2);

        System.out.print("\nMerged Linked List:");
        printList(head1);

        head1 = reverseLinkedList(head1);

        System.out.print("\nreversed Linked List:");
        printList(head1);
    }

    private static Node reverseLinkedList(Node head) {

        Node resultLL = new Node();

        Node head1 = resultLL;
        int size = 0;
        int num = 0;

        Node temp1 = head;
        while (temp1 != null) {
            num += temp1.data;
            num *= 10;
            temp1 = temp1.next;

            size++;
        }
        num = num / 10;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            Node newNode = new Node(r);
            resultLL.next = newNode;
            resultLL = resultLL.next;
        }

        return head1.next;
    }
}
