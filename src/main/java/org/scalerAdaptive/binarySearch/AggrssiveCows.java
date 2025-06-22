package org.scalerAdaptive.binarySearch;

public class AggrssiveCows {


    public static void main(String[] args) {
        int[] A = {5,17,100,11};
        int c = 2;
        AggrssiveCows obj = new AggrssiveCows();
        System.out.println(obj.solve(A, c));
    }
    public int solve(int[] A, int B) {
        int n = A.length;
        int min = A[0];
        int l = Integer.MAX_VALUE;
        int h = 0;
if(A.length>1){
    h=A[n - 1] - A[0];
}

        for (int i =1;i<A.length;i++) {
            int max = Math.max(A[i], A[i-1]);
            int low = Math.min(A[i], A[i-1]);
            int diff = max - low;
            l = Math.min(l, diff);
        }

        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (checkPossible(A, B, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
    boolean checkPossible(int[] A, int C, int mid) {
        int cows = 1;
        int lastPos = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] - lastPos >= mid) {
                cows++;
                lastPos = A[i];
            }
        }
        return cows == C;
    }
}
