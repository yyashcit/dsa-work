package org.scalerAdaptive.linkedList;

public class MergeTwoSortedLL extends ListNode {

    public MergeTwoSortedLL(int x) {
        super(x);
    }

    public static void main(String[] args) {
        MergeTwoSortedLL obj = new MergeTwoSortedLL(1);
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);
        // list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);
//        list2.next.next = new ListNode(6);

        ListNode mergedList = obj.mergeTwoListUsingIteration(list1, list2);
        printLinkedList(mergedList);
    }

    public ListNode mergeTwoListUsingIteration(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
