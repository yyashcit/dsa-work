package org.scalerAdaptive.array;

import java.util.HashMap;

public class ProductsofArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,3};
        ProductsofArrayExceptSelf obj = new ProductsofArrayExceptSelf();
        int[] result = obj.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] productExceptSelf(int[] nums) {

        int prod=1;
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i:nums){
            if(i!=0){
                prod=prod*i;
                hm.put(i,prod);}else {
                hm.put(i,0);
            }
        }
        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            if(maxProd<hm.get(nums[i])){
                maxProd=hm.get(nums[i]);
            }
        }
        boolean isContainZero=false;
        if(hm.containsKey(0))
        {
            isContainZero=true;
        }

        for(int i=0;i<nums.length;i++){

            if(isContainZero&&nums[i]!=0){
                nums[i]=0;
            }else if(!isContainZero){

                int p= maxProd/nums[i];
                nums[i]=p;
            }else  if(isContainZero&&nums[i]==0){
                nums[i]=maxProd;
            }
        }
        return nums;

    }
}
