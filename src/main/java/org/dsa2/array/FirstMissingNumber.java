package org.dsa2.array;

public class FirstMissingNumber {


    public static void main(String[] args) {
        FirstMissingNumber obj = new FirstMissingNumber();
        int[] A = { 1, 2, 0 };
        System.out.println(obj.getFirstMissingNumber(A));

    }

    int getFirstMissingNumber(int[] A) {

        int n = A.length;
        for (int i = 0; i < n; i++) {

            if (A[i] < 0) {
                A[i] = n + 2;
            }
        }
        for (int i = 0; i < n; i++) {
            int val = Math.abs(A[i]);

            if (val >= 1 && val <= n) {
                int idx = val - 1;
                if (A[idx] > 0) {
                    A[idx] *= -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (A[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;

    }
}
