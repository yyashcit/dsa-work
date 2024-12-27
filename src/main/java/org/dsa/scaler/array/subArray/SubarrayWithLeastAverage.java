package org.dsa.scaler.array.subArray;

public class SubarrayWithLeastAverage {

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};

        SubarrayWithLeastAverage obj = new SubarrayWithLeastAverage();
        System.out.println(obj.solve(A, 10));
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        int[] prefixSumAr = new int[n];
        int minSum = Integer.MAX_VALUE;
        //prepare prefixSumAr
        prefixSumAr[0] = A[0];
        for (int i = 1; i < n; i++)
            prefixSumAr[i] = prefixSumAr[i - 1] + A[i];


        int count = 0;
        for (int i = 0; i < n; i++) {
            int subArSum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    subArSum = prefixSumAr[j];
                } else {
                    subArSum = prefixSumAr[j] - prefixSumAr[i - 1];
                }
                if (subArSum < B) {
                    count++;
                }
            }
        }
        return count;

    }
}
