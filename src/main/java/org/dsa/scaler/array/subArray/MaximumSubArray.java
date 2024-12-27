package org.dsa.scaler.array.subArray;

public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray obj = new MaximumSubArray();
        int[] A = {4};
        System.out.println(obj.maxSubarray(1, 75, A));
    }

    public int maxSubarray(int A, int B, int[] C) {


        int totalSum = 0;
        for (int i = 0; i < A; i++) {
            int sum = 0;

            for (int j = i; j < A; j++) {
                sum += C[j];
                if (B >= sum) {
                    totalSum = Math.max(sum, totalSum);
                } else {
                    break;
                }

            }


        }
        return totalSum;
    }

}
