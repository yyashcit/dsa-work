package org.dsa.array;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        int i=30%10;
       boolean ans=  containsDuplicate(nums);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums) {
        int totalUnique=0;
        for(int i=0;i<nums.length;i++){
            int duplicateCounter=0;
            for(int j=i+1;j<nums.length;j++)
            {

                if(nums[i]==nums[j]){
                    duplicateCounter++;
                    break;
                }
            }

            if(duplicateCounter>0){

                return true;

            }else {totalUnique++;}
        }


        return totalUnique==nums.length?false:true;


    }
}
