package org.dsa.binary;

public class FindMissingNumber {

    public static void main(String[] args) {
int[] nums= {1};
        System.out.println(missingNumber(nums));
    }
    public static  int missingNumber(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {

            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
        }
        int missingNumber=nums[nums.length-1]+1;
        for(int i=0;i<nums.length;i++)

        { int j=i+1;
            if(j<nums.length&&(nums[i]+1)!=nums[j])
            {
                missingNumber=nums[i]+1;
            }
        }
if(nums.length==1)
{
    missingNumber=nums[nums.length-1]-1;
}
        return missingNumber;
    }

}
