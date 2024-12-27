package org.dsa.scaler.array.subArray;

public class GoodSubarrays {

    public static void main(String[] args) {
        GoodSubarrays obj = new GoodSubarrays();


//        int[] A = {1, 2, 3, 4, 5};
        int[] A = {15, 8, 16};
        System.out.println(obj.solve(A, 242));
    }


    public int solve(int[] A, int B) {


        int count = 0;
        int n = A.length;

        int[] prefixSumAr = new int[n];

        //prepare prefixSumAr
        prefixSumAr[0] = A[0];
        for (int i = 1; i < n; i++)
            prefixSumAr[i] = prefixSumAr[i - 1] + A[i];

        for (int i = 0; i < n; i++) {
            int subArSum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    subArSum = prefixSumAr[j];
                } else {
                    subArSum = prefixSumAr[j] - prefixSumAr[i - 1];
                }
                int len = j - i + 1;
                System.out.println("len {}" + len);
                if (len % 2 == 0 && subArSum < B) {
                    count++;
                } else if (len % 2 != 0 && subArSum > B) {
                    count++;
                }
            }

        }


        return count;
    }
}
