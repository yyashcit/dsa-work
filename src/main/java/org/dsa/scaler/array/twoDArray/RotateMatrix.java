package org.dsa.scaler.array.twoDArray;

public class RotateMatrix {


    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {1, 2},
                {3, 4}

        };
        RotateMatrix obj=new RotateMatrix();
        System.out.println(obj.rotate(B));
    }

    public int rotate(int[][] A) {
        int rLength = A.length;
        int cLength = A[0].length;

        int[][] ans = new int[cLength][rLength];

        int colIndex=0;
        for(int r=rLength-1;r>=0;r--){


            for(int c=0;c<cLength;c++){

                ans[c][colIndex]=A[r][c];
            }
            colIndex++;
        }
        A=ans;
        System.out.println(A);
    return 1;
    }
    public void solve(int[][] A) {
        for(int r = 0; r < A.length; r++)
        {
            for(int c = r+1; c < A[0].length; c++)
            {
                int temp = A[r][c];
                A[r][c] = A[c][r];
                A[c][r] = temp;
            }
        }
        for(int i = 0; i < A.length; i++)
        {
            int s = 0;
            int e = A.length-1;
            while(s < e)
            {
                int temp = A[i][s];
                A[i][s] = A[i][e];
                A[i][e] = temp;
                s++;
                e--;
            }
        }
        }
    }
