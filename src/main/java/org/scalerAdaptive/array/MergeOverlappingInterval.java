package org.scalerAdaptive.array;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1, 5 }, {4 ,6}, {7, 20}, {15, 30}, {31, 34}, {35, 50}};
        MergeOverlappingInterval obj = new MergeOverlappingInterval();

        System.out.println(obj.mergeInterval(intervals));

    }

   List<List<Integer>> mergeInterval(int[][] intervals){
       List<List<Integer>> ans=new ArrayList<>();

       int prevStart = intervals[0][0];
       int prevEnd = intervals[0][1];
       for(int i=1;i<intervals.length;i++){
           int start = intervals[i][0];
           int end = intervals[i][1];

           if(start<=prevEnd){
               prevEnd=Math.max(prevEnd,end);
           }else {
               List<Integer> temp=new ArrayList<>();
               temp.add(prevStart);
               temp.add(prevEnd);
               ans.add(temp);
               prevStart=start;
               prevEnd=end;
           }
       }
return ans;
   }
}
