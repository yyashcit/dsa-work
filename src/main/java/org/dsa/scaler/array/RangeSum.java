package org.dsa.scaler.array;

public class RangeSum {

    public static void main(String[] args) {
        RangeSum obj = new RangeSum();
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};

        obj.optimizedRangeSum(A, B);
    }

    public long[] rangeSum(int[] A, int[][] B) {
        long[] ans = new long[B.length];

        for (int i = 0; i < B.length; i++) {

            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            for (int j = L; j <= R; j++) {
                sum += A[j];

            }
            ans[i] = sum;
        }
        return ans;
    }


    public long[] optimizedRangeSum(int[] A, int[][] B) {
        long[] ans = new long[B.length];
        long[] pf = new long[A.length];

        pf[0] = A[0];

        for (int k = 1; k < A.length; k++) {
            pf[k] = pf[k - 1] + A[k];
        }

        for (int i = 0; i < B.length; i++) {

            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;

                if (L == 0) {
                    ans[i] = pf[R];
                } else {
                    ans[i] = pf[R] - pf[L - 1];
                }

        }
        return ans;
    }
}
