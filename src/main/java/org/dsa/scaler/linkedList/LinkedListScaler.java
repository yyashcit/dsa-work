package org.dsa.scaler.linkedList;

import org.dsa.linkedList.ListNode;

public class LinkedListScaler {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        int B = 2;
        int C = 4;
        head1 = revInRange(head1, B, C);
    }

    private static ListNode revInRange(ListNode head, int b, int c) {


        int size = 0;
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp != null) {

            size++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        ListNode rev = new ListNode();
        for (int i = 1; i <= c; i++) {

            if (temp1 != null && i >= b && i <= c) {
                System.out.println(temp1.val);
                ListNode nn = new ListNode(temp1.val);
                rev.next = nn;
                rev=rev.next;
            }
temp1=temp1.next;
        }


        return head;
    }


}