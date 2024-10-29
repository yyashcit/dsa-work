package org.dsa.bitmanupulation;

public class MissingNumber {

    public static void main(String[] args) {
        int num[] = {10,12,13};
        int ans = getMissingNumber(num);
        System.out.println("ans " + ans);
    }

    private static int getMissingNumber(int[] num) {
        int xOr = 0;

        for (int i = 0; i <= num.length; i++) {
            xOr = xOr ^ i;
        }
        for (int n : num) {
            xOr = xOr ^ n;
        }
        return xOr;
    }
}
