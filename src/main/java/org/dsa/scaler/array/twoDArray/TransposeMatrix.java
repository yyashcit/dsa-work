package org.dsa.scaler.array.twoDArray;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] B = {
                {1, 2},
                {1, 2},
                {1, 2}
        };

        TransposeMatrix obj=new TransposeMatrix();
        System.out.println(obj.diagonal(B));
    }

    public int[][] diagonal(int[][] A) {
        int rLength = A.length;
        int cLength = A[0].length;

        int[][] ans = new int[cLength][rLength];
        int index = 0;

        //print allDiagonal from 0th row
        for (int c = 0; c < cLength; c++) {
            int[] innerAr = new int[rLength];
            int idx = 0;
            for (int r = 0; r< rLength; r++) {

                System.out.print(A[r][c] + ",");
                innerAr[idx] = A[r][c];
                idx++;
            }
            ans[index] = innerAr;
            index++;
        }
        return ans;}
}
