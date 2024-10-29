package org.dsa.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSquareStreak {

    public static void main(String[] args) {
        LongestSquareStreak obj = new LongestSquareStreak();
        int num[] = {4, 3, 6, 16, 8, 2};
        int ans = obj.longestSquareStreak(num);
        System.out.println(ans);
    }

    public int longestSquareStreak(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            int square = nums[i] * nums[i];
            for (int j = 0; j < nums.length; j++) {

                if (square == nums[j]) {
                    hm.put(index, square);
                    index++;

                }
            }
        }
        int result[] = new int[hm.size()];
        int idx = 0;
        for (Integer key : hm.keySet()) {

            result[idx] = hm.get(key);
            System.out.print(result[idx]+" ");
            idx++;

        }
        Arrays.sort(result);

        return idx;
    }

}
