package org.dsa.scaler.array.twoDArray;

public class PrintAntiDiagonals {

    public static void main(String[] args) {
        PrintAntiDiagonals obj = new PrintAntiDiagonals();
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(obj.diagonal(A));
    }

    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int len = n + n - 1;
        int[][] ans = new int[len][];
        int index = 0;

        //print allDiagonal from 0th row
        for (int c = 0; c < n; c++) {
            int i = 0, j = c;
            int[] innerAr = new int[n];
            int idx = 0;
            while (i < n && j >= 0) {
                System.out.print(A[i][j] + ",");
                innerAr[idx] = A[i][j];
                i++;
                j--;
                idx++;
            }
            ans[index] = innerAr;
            index++;
        }

        //print allDiagonal from last column


        for (int r = 1; r < n; r++) {
            int i = r;
            int j = n - 1;
            int[] innerAr = new int[n];
            int idx = 0;

            while (i < n && j >= 0) {
                innerAr[idx] = A[i][j];
                i++;
                j--;
                idx++;
            }
            ans[index] = innerAr;
            index++;

        }


        return ans;
    }
}
