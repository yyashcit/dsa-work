package org.dsa.tree;


class CountOfNodes {

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
        //root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(heightOfTree(root));
        //System.out.println(isBalancedTree(root));
    }


    private static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = heightOfTree(root.left);
        System.out.println("leftCount "+leftCount);
        int rightCount = heightOfTree(root.right);
        System.out.println("righttCount "+rightCount);

        //System.out.println("leftCount+rightCount+1 "+leftCount+rightCount+1);

        return Math.max(leftCount, rightCount) + 1;
    }
    static boolean isBalancedTree(Node root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(heightOfTree(root.left))-Math.abs(heightOfTree(root.right))>1)
        {
            return false;
        }

        return isBalancedTree(root.left)&&isBalancedTree(root.right);
    }

}