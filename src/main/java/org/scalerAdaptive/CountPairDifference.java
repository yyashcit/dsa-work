package org.scalerAdaptive;

import java.util.ArrayList;
import java.util.HashMap;

public class CountPairDifference {

    public static void main(String[] args) {
int[] arr={2,1,2,1,2,1,2,1,2};
        ArrayList<Integer> A=new ArrayList<>();
        for(int i:arr){
            A.add(i);
        }
        CountPairDifference obj=new CountPairDifference();
        System.out.println(obj.solve(A,1));
    }


    public int solve(ArrayList<Integer> A, int B) {

        HashMap<Integer,Integer> hm=new HashMap();
        for(int i:A){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }

        int count=0;
        for(int i:A){
            if(hm.containsKey(B+i)){
                count+=hm.get(B+i);
            }

        }
        return count;

    }
}
