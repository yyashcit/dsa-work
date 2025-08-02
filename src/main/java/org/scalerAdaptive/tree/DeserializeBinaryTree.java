package org.scalerAdaptive.tree;

import java.util.*;

public class DeserializeBinaryTree extends TreeNode {

    public DeserializeBinaryTree(int x) {
        super(x);
    }

    public static void main(String[] args) {
        DeserializeBinaryTree root = new DeserializeBinaryTree(1);

        List<Integer> al =  Arrays.asList(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1);
       int i= Collections.max(al);
        System.out.println("Max value in the list: " + i);
        /*    root.left = new DeserializeBinaryTree(2);
        root.right = new DeserializeBinaryTree(3);
        root.left.left = new DeserializeBinaryTree(4);
        root.left.right = new DeserializeBinaryTree(5);
        root.right.right = new DeserializeBinaryTree(6);

    */
        System.out.println("Ans of deserialize Tree: " + root.deserialize(al));
        System.out.println();

    }

    void printTreeNode(TreeNode node) {
       /* if (node == null) {
            return "null";
        }
       *//* System.out.println( "TreeNode{" +
                "val=" + node.val +
                ", left=" + printTreeNode(node.left) +
                ", right=" + printTreeNode(node.right) +
                '}');*/
    }
    public TreeNode deserialize(List<Integer> A) {
        TreeNode root = new TreeNode(A.get(0));
        if (A.size() == 1) {
            return root;
        }

        TreeNode current = root;
        TreeNode tempRight = new TreeNode(-1);
        for (int i = 1; i < A.size(); i++) {

            if (i % 2 != 0) {

                current.left = new TreeNode(A.get(i));
                current = current.left;
            } else {
                tempRight.right = new TreeNode(A.get(i));
                tempRight = tempRight.right;
            }


        }
        root.right = tempRight;
        return root;
    }
}
