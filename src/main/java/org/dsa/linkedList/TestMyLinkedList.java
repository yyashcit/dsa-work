package org.dsa.linkedList;

public class TestMyLinkedList {
    MyLinkedList ll = new MyLinkedList();

    public static void main(String[] args) {
        TestMyLinkedList testObj = new TestMyLinkedList();
        testObj.insertFirst(1);
        testObj.insertLast(5);
        testObj.insertInMiddile(3,4);
        testObj.display();
    }

    ListNode insertFirst(int value) {
        ListNode firstNode = new ListNode(value);
        firstNode.next = ll.head;
        ll.head = firstNode;
        if (ll.tail == null) {
            ll.tail = ll.head;

        }
        ll.size += 1;
        return firstNode;
    }

    ListNode insertLast(int value) {
        if (ll.tail == null) {
            insertFirst(value);
            return null;
        }

        ListNode node = new ListNode(value);
        //node.next=ll.tail;
        ll.tail.next = node;
        ll.tail = node;
        ll.size += 1;
        return node;
    }


    ListNode insertInMiddile(int index, int value) {
        if (ll.head == null) {
            insertFirst(value);
            return null;
        }
        if (ll.size < index) {
            insertLast(value);
            return null;
        }

        ListNode prevNode = ll.head;
        for (int i = 1; i < index; i++) {
            prevNode = prevNode.next;
        }
        ListNode node = new ListNode(value, prevNode);
        prevNode.next = node;
        ll.size++;
        return node;
    }

    public void display() {
        ListNode node = ll.head;
        for (int i = 0; i < ll.size; i++) {
            if (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
        System.out.println("End");

    }
}
