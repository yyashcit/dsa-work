package org.dsa.array;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums= {1,1,2};
       int ans=  removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int index=0;
        int length=nums.length;
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

            if(duplicateCounter==0){
                totalUnique++;
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+", ");
        }
        System.out.println();


        return totalUnique;
    }
}
