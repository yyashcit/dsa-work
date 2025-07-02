package org.scalerAdaptive.array;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval2 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3 }, {6 ,9}};
        int[]   newInterval = {2, 5};

        MergeOverlappingInterval2 obj = new MergeOverlappingInterval2();

        System.out.println(obj.mergeInterval(intervals, newInterval));

    }

   List<List<Integer>> mergeInterval(int[][] intervals, int[] newInterval){
       List<List<Integer>> ans=new ArrayList<>();

       int newIntervalS = newInterval[0];
       int newIntervalE = newInterval[1];
       for(int i=0;i<intervals.length;i++){
           int nextStart = intervals[i][0];
           int nextEnd = intervals[i][1];

           if(newIntervalS<= nextEnd && newIntervalE >= nextStart){
               newIntervalS = Math.min(newIntervalS, nextStart);
               newIntervalE = Math.max(newIntervalE, nextEnd);

           }else  if(newIntervalS> nextEnd && newIntervalE >= nextStart){
               List<Integer> temp=new ArrayList<>();
               temp.add(nextStart);
               temp.add(nextEnd);
               ans.add(temp);
           }else {
               List<Integer> temp=new ArrayList<>();

               temp.add(nextStart);
               temp.add(newIntervalE);
               ans.add(temp);
               newIntervalS=nextStart;
               newIntervalE= nextEnd;

           }
       }
       List<Integer> temp=new ArrayList<>();
       temp.add(newIntervalS);
       temp.add(newIntervalE);
       ans.add(temp);

       return ans;
   }
}
