package org.dsa.recursion;

//HeightOfTree
// Java program to find the maximum depth of a binary
// tree using depth-first search (DFS) approach.
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

// Returns "maxDepth" which is the number of nodes
// along the longest path from the root node down
// to the farthest leaf node.
class HeightOfTree {
    static int getheightOfTree(Node root) {
        if (root == null)
            return 0;

        // compute the depth of left and right subtrees
        int leftHeight = getheightOfTree(root.left);
        System.out.println("leftHeight "+leftHeight);
       /* int rightHeight = getheightOfTree(root.right);
        System.out.println("rightHeight "+rightHeight);
*/
        return Math.max(leftHeight, 1) + 1;
    }

    public static void main(String[] args) {

        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(getheightOfTree(root));
    }
}