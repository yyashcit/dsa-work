package org.dsa.linkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int data) {
        this.val = data;
    }

    public ListNode(int data, ListNode next) {
        this.val = data;
        this.next = next;
    }

    public ListNode() {

    }

    public static void main(String[] args) {
        ListNode l = new ListNode();
     ListNode rrLL=   l.reverseLinkedList(l);
    while(rrLL!=null)
     {
         System.out.println(rrLL.val);
         rrLL= rrLL.next;
     }

    }

    ListNode reverseLinkedList(ListNode head) {
        int num = 12345;
        int size = 5;
        ListNode reveLL = new ListNode();
        int i = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            if (i == 0) {
                reveLL.val = r;
                i++;
            }
         else   if(i>0){

                ListNode newNode=new ListNode(r);
                ListNode temp=reveLL;


                for(int j=1;j<i;j++){
                   temp=temp.next;
                }
                temp.next=newNode;
                i++;
         }

        }


        return reveLL;
    }


}
