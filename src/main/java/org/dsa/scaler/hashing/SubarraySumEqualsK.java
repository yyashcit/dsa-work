package org.dsa.scaler.hashing;

import java.util.HashSet;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int[] A = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};
        System.out.println(obj.solve(A, 4));

    }

    public int solve(int[] A, int B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        int n = A.length;
        long preSum = 0;
        HashSet<Long> hs = new HashSet();

        hs.add(0l);
        int count = 0;
        for (int i = 0; i < n; i++) {
            preSum += A[i];

            //System.out.print(preSum + " ");

           int y=(int)preSum-B;
            System.out.print("  preSum "+preSum + " y "+y);

            if(hs.contains(y)){

                count++;
            } else {
                hs.add(preSum);
            }
            //System.out.println("i "+i);
        }
        System.out.println();
        return count;
    }

}
