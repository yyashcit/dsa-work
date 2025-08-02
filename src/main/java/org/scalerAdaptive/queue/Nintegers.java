package org.scalerAdaptive.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Nintegers {

    public static void main(String[] args) {
        Nintegers obj = new Nintegers();
        int A = 8; // Example input
        ArrayList<Integer> result = obj.solve(A);
        System.out.println(result); // Expected output: [1, 2, 3, 4, 5]
    }

    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            queue.offer(i);

        }

        while (queue.size() < A) {


            int first = queue.poll();
            ans.add(first);
            queue.offer(first * 10 + 1);
            queue.offer(first * 10 + 2);
            queue.offer(first * 10 + 3);

        }
        int existingSize = ans.size();
        for (int i = 1; i <= A - existingSize; i++) {
            ans.add(queue.poll());
        }

        return ans;


    }
}
