package org.dsa.linkedList;

import java.util.List;

public class BasicOperationOfLL {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);


        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        System.out.println("given LL");
        BasicOperationOfLL llObj = new BasicOperationOfLL();
        llObj.printList(head1);
        System.out.println("insert at Begin ");
        llObj.printList(llObj.insertAtBegin(head1, 0));
        System.out.println("insert at end ");
        llObj.printList(llObj.insertAtEnd(head1, 6));
        System.out.println("insert at 4 position ");
        llObj.printList(llObj.insertAtPosition(head1, 8, 4));
        System.out.println("get value from index 4  ");
        System.out.println(llObj.getValueFromIndex(head1, 4));

        System.out.println("delete from index 2  ");

         llObj.printList(llObj.deleteFromPosition(head1,  2));
    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }

    ListNode insertAtBegin(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head = newNode;
        return head;
    }

    public ListNode insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

        return head;
    }

    ListNode insertAtPosition(ListNode head, int data, int pos) {

        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        ListNode curr = head;
        for (int i = 0; i < pos; i++) {
            if (curr == null) {
                System.out.println("invalid position " + pos);
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    int getValueFromIndex(ListNode head, int index) {
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            if (curr == null) {
                System.out.println("invalid index");
            }
            curr = curr.next;
        }
        return curr.val;
    }
int size(ListNode head)
{
 int size=0;

 while (head!=null){
     size++;
     head=head.next;
 }
 return size;
}
ListNode deleteFromPosition(ListNode head,int pos)
{
    ListNode curr=head;
    for(int i=0;i<pos-1;i++){

        if(curr==null){
            System.out.println("invalid index "+pos);
        }
        curr=curr.next;
    }
    ListNode temp=curr.next.next;
    curr.next=temp;
    return  head;
}
}
