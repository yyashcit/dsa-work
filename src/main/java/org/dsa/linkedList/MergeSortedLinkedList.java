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
        boolean isPali = isPalindrome(head1);
        System.out.print("is Given Linked List palindrome: " + isPali);
head1=        removeNthFromEnd(head1,1);
        System.out.print("print after removed nth node: " + isPali);
        printList(head1);

        head1 = mergeTwoLists(head1, head2);
        //head1 = mergeTwoLists2(head1, head2);

        System.out.print("\nMerged Linked List:");
        printList(head1);

//        head1 = reverseLinkedList(head1);
        head1 = reverseLinkedListByRecursion(head1);
        System.out.print("\nreversed Linked List:");
        printList(head1);

    }

    static Node reverseLinkedListByRecursion(Node head){
        if (head == null || head.next == null)
            return head;

        // Reverse the rest of the list
        Node revHead = reverseLinkedListByRecursion(head.next);
        System.out.println(head);
        // Make the current head the last node
        head.next.next = head;

        // Update the next of current head to NULL
        head.next = null;

        // Return the new head of the reversed list
        return revHead;
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

    private static boolean isPalindrome(Node head) {


        String tempStr = "";

        Node temp = head;
        while (temp != null) {

            tempStr = tempStr + temp.data;
            temp = temp.next;
        }
        String revStr = reverStr(tempStr);

        return tempStr.equals(revStr) ? true : false;
    }

    static String reverStr(String tempStr) {

        if (tempStr.length() == 0) {
            return "";
        }
        char ch = tempStr.charAt(0);
        tempStr = reverStr(tempStr.substring(1));

        return tempStr + ch;
    }

    public static Node mergeTwoLists2(Node list1, Node list2) {
        Node result = new Node();


        if (list1 == null && list2 == null) {
            return list1;

        }

        if (list1 != null && list2 == null) {
            return list1;

        }
        if (list1 == null && list2 != null) {
            return list2;

        }

        Node tempResult = result;

        Node tempList1 = list1;
        Node tempList2 = list2;
        while (tempList1 != null && tempList2 != null) {


            if (tempList1 != null && tempList2 == null) {

                while (tempList1 != null) {
                    Node newNode = new Node(tempList1.data);
                    tempResult.next = newNode;
                    tempResult = tempResult.next;
                    tempList1 = tempList1.next;
                }
                return tempResult.next;
            }
            if (tempList1 == null && tempList2 != null) {

                while (tempList2 != null) {
                    Node newNode = new Node(tempList2.data);
                    tempResult.next = newNode;
                    tempResult = tempResult.next;
                    tempList2 = tempList2.next;
                }
                return tempResult.next;
            }

            if (tempList1.data < tempList2.data) {
                Node newNode = new Node(tempList1.data);
                tempResult.next = newNode;
                tempResult = tempResult.next;
                tempList1 = tempList1.next;
            }

            if (tempList1.data > tempList2.data) {
                Node newNode = new Node(tempList2.data);
                tempResult.next = newNode;
                tempResult = tempResult.next;
                tempList1 = tempList2.next;
            }

            if (tempList1.data == tempList2.data) {
                Node newNode1 = new Node(tempList1.data);
                tempResult.next = newNode1;
                tempResult = tempResult.next;
                Node newNode2 = new Node(tempList2.data);
                tempResult.next = newNode2;
                tempList1 = tempList1.next;
                tempResult = tempResult.next;
                tempList2 = tempList2.next;
            }
        }
        return result.next;
    }
    public static Node removeNthFromEnd(Node head, int n) {
        int size = 0;
        Node resultLL=new Node();
        Node temphead=resultLL;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int position=size-n;

        int p=1;
        Node temp1 = head;
        while (temp1!=null){

            if(p==position){
                resultLL.next=temp1.next;
                resultLL=resultLL.next;
break;
            }
            resultLL.next=temp1;
            resultLL=resultLL.next;
            p++;
           temp1= temp1.next;
        }

        return resultLL.next;


    }
}
