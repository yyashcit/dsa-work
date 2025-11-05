package org.scalerAdaptive.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FindSubarrayForGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(solve(arr, k));
    }

    public static int[] solve(int[] A, int B) {
        //Map to store prefix sum and its index
        HashMap<Long,Integer> prefixSumMap=new HashMap<>();
        long sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            //If the sum itself is B,return subarray from start
            if(sum==B){
                return Arrays.copyOfRange(A,0,i+1);
            }
            //If (sum-B) exists in the map, then we found a subarray
            if(prefixSumMap.containsKey(sum-B)){
                int startIdx=prefixSumMap.get(sum-B)+1;
                return Arrays.copyOfRange(A,startIdx,i+1);
            }
            //store the sum and index in the map
            prefixSumMap.put(sum,i);
        }
        //If no subarray found
        return new int[]{-1};

    }

}
