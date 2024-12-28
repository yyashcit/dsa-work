package org.dsa.scaler.sorting;

import java.util.Arrays;

public class NobleInteger {

    public static void main(String[] args) {
        NobleInteger obj = new NobleInteger();
        int[] A = {3, 2, 1, 3};
        System.out.println(obj.solve(A));
    }

    public int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        if (A[n - 1] == 0) {
            return 1;
        }
        int count = 0;
         for (int i = n - 2; i >= 0; i--) {
            if (A[i] != A[i + 1]) {
                count = n - 1 - i;
                if (A[i] == count) {
                    return 1;
                }
            }
        }
        return -1;
    }
}