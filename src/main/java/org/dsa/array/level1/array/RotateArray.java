package org.dsa.array.level1.array;

public class RotateArray {


    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;
        nums = reverseArray(nums, 0, nums.length - 1);
        nums = reverseArray(nums, 0, k - 1);
        nums = reverseArray(nums, k, nums.length - 1);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    private static int[] reverseArray(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
        return nums;
    }
}
