package org.scalerAdaptive.linkedList;

public class LinkedListOperations {
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
        LinkedListOperations obj = new LinkedListOperations();
        //obj.printLinkedList(obj.insertAtSpecificPosition(head, 10, 15));
        System.out.println();
        //obj.printLinkedList(obj.deleteFromSpecificPosition(head, 3));
        obj.test1();
    }

    void test() {
        System.out.println("inside test method");
        ListNode temp1 = head;

        ListNode temp2 = head;

/*        while (temp1 != null) {
            temp1 = temp1.next;
        }*/
        temp1 = head.next;
        printLinkedList(temp1);
        printLinkedList(temp2);
    }

    void test1() {
        System.out.println("inside test1 method");
        ListNode temp = head;
        int n = 2;
        while (temp != null && n > 0) {
            temp = temp.next;
            n--;
        }

        printLinkedList(temp);
        printLinkedList(head);
    }


    ListNode insertAtSpecificPosition(ListNode h, int B, int idx) {
        ListNode temp = h;
        //insert at 0-idx

        if (idx == 0) {

            ListNode newNode = new ListNode(B);
            newNode.next = temp;

            return newNode;
        }

        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        //insert at tail
        if (size < idx) {
            ListNode tailNode = new ListNode(B);

            ListNode newTemp = h;
            while (newTemp.next != null) {
                newTemp = newTemp.next;
            }
            newTemp.next = tailNode;
        }
        //insert at specific index
        else {
            ListNode newTemp = h;
            for (int i = 1; i < idx - 1; i++) {

                if (newTemp != null) {
                    newTemp = newTemp.next;
                }

            }
            ListNode newNode = new ListNode(B);
            newNode.next = newTemp.next;
            newTemp.next = newNode;

        }
        return h;
    }


    ListNode deleteFromSpecificPosition(ListNode h, int idx) {

        if (h == null || idx < 0) {
            return h; // Invalid index or empty list
        }

        if (idx == 0) {
            return h.next; // Delete head
        }

        ListNode temp = h;
        for (int i = 1; i < idx; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                return null;
            }
        }
        temp.next = temp.next.next;
        return h;
    }

    void printLinkedList(ListNode h) {
        ListNode temp = h;
        while (temp != null) {
            System.out.print(temp.val + " , ");
            temp = temp.next;
        }
        System.out.println();
    }
}
