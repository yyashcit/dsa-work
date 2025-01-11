package org.dsa.scaler.array.twoDArray;

public class MatrixScalarProduct {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        MatrixScalarProduct obj=new MatrixScalarProduct();
        System.out.println(obj.solve(A,2));
    }
    public int[][] solve(int[][] A, int B) {
        int rLength = A.length;
        int cLength = A[0].length;


        for(int r=0;r<rLength;r++){


            for(int c=0;c<cLength;c++){

            A[r][c]=A[r][c]*B;
            }

        }
return A;
    }
}
