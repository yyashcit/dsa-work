package org.dsa.scaler.hashing;

import java.util.HashSet;

public class SubArrayWithZerosum {

    public static void main(String[] args) {
        SubArrayWithZerosum obj=new SubArrayWithZerosum();
        int[] A={2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        System.out.println(obj.solve(A));
    }

    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        int n=A.length;
        long preSum=0;
        HashSet<Long> hs=new HashSet();

        hs.add(0l);
        for(int i=0;i<n;i++)
        {
            preSum+=A[i];
            System.out.print(preSum+" ");
            if(hs.contains(preSum)){
                System.out.println();
                return 1;
            }else {
                hs.add(preSum);
            }

        }
        return 0;
    }

}
