package org.dsa.array;

import java.util.LinkedList;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums =
                {1,2,3,4};
        System.out.println(containsDuplicate(nums));

        LinkedList l=new LinkedList();

    }


    public static boolean containsDuplicate(int[] nums) {

        boolean result = false;
        int i = 0;
        int j = nums.length - 1;
        while (i <= nums.length-1 &&j>=0 ) {
            if (j>=0&&i!=j&&nums[i] == nums[j]) {
                result = true;
                break;
            }
            else {
                if(j==i)
                {
                    i++;
                    j = nums.length - 1;
                }else {
                    j--;}
            }

        }
        return result;
    }
}
