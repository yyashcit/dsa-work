package org.dsa.scaler.array.subArray;

public class ClosedSubArray {

    public static void main(String[] args) {
        ClosedSubArray obj = new ClosedSubArray();
        int[] A = {1, 3, 2};
        System.out.println(obj.solve(A));
    }

    public int solve(int[] A) {

        int n = A.length;
        int ans = n;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = n - 1; i >= 0; i--) {

            if (A[i] == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    ans = Math.min(ans, minIndex - maxIndex + 1);
                }
            }

            if (A[i] == min) {

                minIndex = i;
                if (maxIndex != -1) {
                    ans = Math.min(ans, maxIndex - minIndex + 1);
                }
            }


        }
        return ans;
    }
}
