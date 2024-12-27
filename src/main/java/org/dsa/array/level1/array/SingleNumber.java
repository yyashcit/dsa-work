package org.dsa.array.level1.array;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums= {4,1,2,1,2};
        SingleNumber obj=new SingleNumber();
        obj.getSingleNumber(nums);
    }
   int getSingleNumber(int []nums){
       HashSet<Integer> hs=new HashSet<>();

       for(int i=0;i<nums.length;i++){hs.add(nums[i]);
       }


      return 0;
    }
}
