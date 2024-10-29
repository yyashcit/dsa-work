package org.dsa.bitmanupulation;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int num[] = {2, 2, 3, 2};
        int ans = obj.singleNumber(num);
        System.out.println("ans " + ans);
    }

    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
            System.out.println(xor);
        }
        return xor;
    }
}
