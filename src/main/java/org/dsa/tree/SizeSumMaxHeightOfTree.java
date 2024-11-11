package org.dsa.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SizeSumMaxHeightOfTree {

    public static void main(String[] args) {

        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \   \
        // 4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        SizeSumMaxHeightOfTree obj = new SizeSumMaxHeightOfTree();
        System.out.println("sizeOfTree " + obj.sizeOfTree(root));
        System.out.println("sumOfTree " + obj.sumOfTree(root));
        System.out.println("maxOfTree " + obj.maxOfTree(root));
        System.out.println("heightOfTree " + obj.heightOfTree(root));
        System.out.println("PreOrder traversal");
        obj.preOrderTraversal(root);
        System.out.println();
        System.out.println("InOrder traversal");
        obj.inOrderTraversal(root);
        System.out.println();
        System.out.println("PostOrder traversal");
        obj.postOrderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        obj.levelOrder(root);
    }

    int sizeOfTree(Node root) {

        if (root == null) {
            return 0;
        }
        int leftSize = sizeOfTree(root.left);
        int rightSize = sizeOfTree(root.right);
        return leftSize + rightSize + 1;
    }

    int sumOfTree(Node root) {

        if (root == null) {
            return 0;
        }
        int leftSum = sumOfTree(root.left);
        int rightSum = sumOfTree(root.right);
        int tsum = leftSum + rightSum + root.data;
        return tsum;
    }

    int maxOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxOfTree(root.left);
        int rightMax = maxOfTree(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        //preorder
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        //inorder
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        //inorder
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }

    //trick-RPA (Remove Print Add-child)
    void levelOrderTraversal(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int count = q.size();
            for (int i = 0; i < count; i++) {

                root = q.remove();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
            System.out.println();
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int count = q.size();
            List<Integer> innerList = new ArrayList<>();

            for (int i = 0; i < count; i++) {

                root = q.remove();
                System.out.print(root.data + " ");

                innerList.add(root.data);
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }

            }
            resultList.add(innerList);

            System.out.println();
        }
        System.out.println(resultList);
        return resultList;
    }
}
