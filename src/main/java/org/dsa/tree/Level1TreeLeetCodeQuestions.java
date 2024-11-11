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
        //root.right.right = new Node(6);
        root.right.left = new Node(3);
        root.right.right = new Node(6);
        Level1TreeLeetCodeQuestions obj = new Level1TreeLeetCodeQuestions();
        System.out.println(obj.isValidBST(root));
    }

    private boolean check(Node root, long min, long max) {
        if(root == null)    return true;
       // System.out.println("min "+min+" max "+max+" rootData "+root.data);
        if(root.data <= min || root.data >= max)  return false;

        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }
    public boolean isValidBST(Node root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }


}
