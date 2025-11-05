package org.scalerAdaptive.array;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval2 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3 }, {6 ,9}};
        int[]   newInterval = {2, 5};
List<List<Integer>> result = new ArrayList<>();
        MergeOverlappingInterval2 obj = new MergeOverlappingInterval2();

        System.out.println(obj.mergeInterval(intervals, newInterval));

    }

    public List<List<Integer>> mergeInterval(int[][] intervals, int[] newInterval) {

        List<List<Integer>> result = new ArrayList<>();
        int i = 0;

        // Add all intervals that end before the new interval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(List.of(intervals[i][0], intervals[i][1]));
            i++;
        }

        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(List.of(newInterval[0], newInterval[1]));

        // Add remaining intervals
        while (i < intervals.length) {
            result.add(List.of(intervals[i][0], intervals[i][1]));
            i++;
        }

        return result;
    }}
