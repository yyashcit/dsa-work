package org.scalerAdaptive.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 2;
        TopKFrequentElements obj = new TopKFrequentElements();
        int[] result = obj.topKFrequent(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> freq=new HashMap();
        for(int element:nums){

            if(freq.containsKey(element)){
                freq.put(element,freq.get(element)+1);
            }else {
                freq.put(element,1);
            }
        }

        int max=0;
        for(int key:freq.keySet())
        {
            max=Math.max(max,freq.get(key));
        }
        int[] temp;
        if(max<k){
            temp=new int[k];
        }else
        {     temp=new int[max];
        }
        for(int key:freq.keySet())
        {
            int value=freq.get(key);
            temp[value-1]=key;
        }

        int[] ans=new int[k];
        int idx=1;
        int len=temp.length;
        for(int i=0;i<k;i++)
        {
            ans[i]=temp[len-idx];
            idx++;
        }


        return ans;

    }
}
