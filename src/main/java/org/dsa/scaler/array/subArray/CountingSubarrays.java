package org.dsa.scaler.array.subArray;

public class CountingSubarrays {

    public static void main(String[] args) {
        CountingSubarrays obj = new CountingSubarrays();
          int[] A = {6,3,3,6,7,8,7,3,7};
      //  int[] A = {6};
        System.out.println(obj.solve(A, 2, 10));
    }

    public int solve(int[] A, int B, int C) {
        int ans = 0;
// Check for first window
        int curr_sum = 0;
        for (int i=0; i<B; i++)
            curr_sum += A[i];
        if (curr_sum == C)
            return 1;

        // Consider remaining blocks ending with j
        for (int j = B; j < A.length; j++) {
            curr_sum = curr_sum + A[j] - A[j-B];
            if (curr_sum == C)
                return 1;
        }

        return ans;
    }
}
