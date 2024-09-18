package org.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
       Integer[] arr= {15, 2 ,45, 12, 7};
        valueEqualToIndex(Arrays.asList(arr));
        }
    public static List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> li=new ArrayList<Integer>();

        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){

                if(nums.get(j)==i){
                    li.add(nums.get(j));
                }
            }
        }
        return li;


    }
    }
