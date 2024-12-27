package org.dsa.tree;

public class Level1TreeLeetCodeQuestions {


    public static void main(String[] args) {

        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \   \
        // 4   5   6
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);
        //root.right.right = new Node(6);
        Level1TreeLeetCodeQuestions obj = new Level1TreeLeetCodeQuestions();
        System.out.println(obj.isValidBST(root));
    }

    public boolean isValidBST(Node root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isValidBST(Node root, int min, int max) {

        if (root == null) {
            return false;
        }

        if (root.data <= min || root.data>= max) {
            return true;

        }
        boolean isLeftValid = isValidBST(root.left, root.data, max);
        boolean isrightValid = isValidBST(root.right,min , root.data);
        boolean result = isLeftValid && isrightValid;
        return result;
    }


}
