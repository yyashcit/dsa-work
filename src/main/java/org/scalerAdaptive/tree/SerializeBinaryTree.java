package org.scalerAdaptive.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree extends TreeNode{
    public SerializeBinaryTree(int x) {
        super(x);
    }
    public static void main(String[] args) {
        SerializeBinaryTree root = new SerializeBinaryTree(1);
        root.left = new SerializeBinaryTree(2);
        root.right = new SerializeBinaryTree(3);
        root.left.left = new SerializeBinaryTree(4);
        root.left.right = new SerializeBinaryTree(5);
        root.right.right = new SerializeBinaryTree(6);



        System.out.println("Ans of serialize Tree: " + root.serialize(root));
    }


    public ArrayList<Integer> serialize(TreeNode A) {
        Queue<TreeNode> queue=new LinkedList();
        if(A!=null){
            queue.offer(A);
        }
        //   ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ans=new ArrayList();

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                if(node!=null)
                {
                    ans.add(node.val);
                }
                else {
                    ans.add(-1);
                    continue;
                }
                // process node
                if (node.left != null){ queue.offer(node.left);}
                else {
                    queue.offer(null);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }else {
                    queue.offer(null);
                }

            }

        }
        return ans;
    }


}
