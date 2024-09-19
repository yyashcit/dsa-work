package org.dsa.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums,2));
    }
    public static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        int resultIndex=-1;
        while(r>=l)
        {
            int m=(l+r)/2;
            if(target>nums[m]){
                l=m+1;
            }
            if(target<nums[m]){
                r=m-1;
            }
            if(target==nums[m]) {
                resultIndex=m;
                break;
            }
        }
        return resultIndex;
    }
}
