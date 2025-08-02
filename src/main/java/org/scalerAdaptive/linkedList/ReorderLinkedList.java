package org.scalerAdaptive.linkedList;

import static org.scalerAdaptive.linkedList.MergeTwoSortedLL.printLinkedList;

public class ReorderLinkedList extends ListNode {
    int size = 0;

    public ReorderLinkedList(int x) {
        super(x);
    }

    public static void main(String[] args) {
        ReorderLinkedList obj = new ReorderLinkedList(1);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reorderedHead = obj.reorderList2(head);
        printLinkedList(reorderedHead);
    }


    public ListNode reorderList2(ListNode head) {
        ListNode temp = head;
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        ListNode revList = reverseList(temp);

        int n = size / 2;
        if (size % 2 == 0) {
            for (int i = 0; i < n; i++) {
//add node from start
                curr.next = temp;
                curr = curr.next;
                temp = temp.next;

//add node from end
                curr.next = revList;
                curr = curr.next;
                revList = revList.next;
            }
        } else {
            for (int i = 0; i < n; i++) {
//add node from start
                curr.next = temp;
                curr = curr.next;
                temp = temp.next;

//add node from end
                curr.next = revList;
                curr = curr.next;
                revList = revList.next;

            }
            curr.next = temp;
            curr = curr.next;

        }
        return curr.next;

    }

    ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            size++;
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Step 3: Merge the two halves
        ListNode firstHalf = head, secondHalf = prev;
        while (secondHalf != null && firstHalf != slow) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }

        return head;
    }
}
