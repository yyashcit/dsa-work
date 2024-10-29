package org.dsa.dynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        int ans = obj.climbStairs(10);
        System.out.println(ans);
    }

    int ar[];
    boolean flag = true;

    public int climbStairs(int n) {
        if (flag) {
            ar = new int[n + 1];
            flag = false;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ar[n] > 0) {
            return ar[n];
        }
        int count1 = climbStairs(n - 1);
        int count2 = climbStairs(n - 2);
        int totalRoute = 0;
        totalRoute = count1 + count2;
        ar[n] = totalRoute;
        return totalRoute;
    }
}
