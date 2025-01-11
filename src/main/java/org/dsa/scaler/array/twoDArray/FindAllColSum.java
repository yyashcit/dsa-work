package org.dsa.scaler.array.twoDArray;

public class FindAllColSum {

    public static void main(String[] args) {
        FindAllColSum obj = new FindAllColSum();
        int[][] A = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 2, 3, 4}};
        System.out.println(obj.solve(A));
    }

    public int[] solve(int[][] A) {

        int[] ans = new int[A[0].length];
        int idx = 0;
        for (int c = 0; c < A[0].length; c++) {

            int colSum = 0;

            for (int r = 0; r < A.length; r++) {

                colSum += A[r][c];

            }

            ans[idx] = colSum;
            idx++;
        }
        return ans;
    }
}
