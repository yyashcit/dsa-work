package org.dsa.treeBinarySearch;

public class ConvertSortedArrayToBinarySearchTree {
    int ar[];

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree obj = new ConvertSortedArrayToBinarySearchTree();
        int num[] = {-10, -3, 0, 5, 9};
      Node bst=  obj.sortedArrayToBST(num);
      printList(bst);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.left;
        }
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.right;
        }
        System.out.println();
    }


    public Node sortedArrayToBST(int[] nums) {
        ar = nums;
        Node bst = buidBST(0, ar.length - 1);
        return bst;
    }

    private Node buidBST(int s, int e) {

        if (s > e) {
            return null;
        }

        int mid = (s + e) / 2;
        Node curr = new Node(ar[mid]);
        curr.left = buidBST(s, mid - 1);
        curr.right = buidBST(mid+1, e);

        return curr;
    }
}
