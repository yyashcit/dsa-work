package org.dsa.array.level1.array;

import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {

        int[] nums= {1,2,3,1};
        System.out.println(checkDuplicate(nums));
    }

    private static boolean checkDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(hm.containsKey(nums[i])){
                return true;
            }
            else {hm.put(nums[i],1);}
        }
    return false;
    }
}
