package org.dsa.tree;


class InvertBinayTree {

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

        System.out.println(invertBinaryTree(root));
    }

    static Node invertBinaryTree(Node root) {
        swap(root);
        return root;
    }

    static void swap(Node curr) {
        if (curr == null) {
            return;
        }

        swap(curr.left);
        swap(curr.right);
        Node temp = new Node();
        temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
    }
}