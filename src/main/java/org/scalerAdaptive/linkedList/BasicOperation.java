package org.scalerAdaptive.linkedList;

import static org.scalerAdaptive.linkedList.MergeTwoSortedLL.printLinkedList;

public class BasicOperation {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        BasicOperation obj = new BasicOperation();
        obj.removeNthNodeFromEnd(head, 2);
        ListNode result = obj.test(head);
      // printLinkedList(head);
    }


    public ListNode test(ListNode head){
        ListNode temp= head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        temp = head;
        return  head;
    }

    ListNode removeNthNodeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
