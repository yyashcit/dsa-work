package org.scalerAdaptive.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int D = 5;
        CapacityToShipPackagesWithinDDays obj = new CapacityToShipPackagesWithinDDays();
        int result = obj.getCapacityToShip(5,  new ArrayList<>(al));
        System.out.println(" Least weight capacity of the ship: " + result);
    }

    public int getCapacityToShip(int A,  ArrayList<Integer> C) {


        int l = Collections.max(C);
        int h = C.stream().mapToInt(Integer::intValue).sum();
        int ans = 0;
        while (l <= h) {

            int mid = (l + h) / 2;
            if (checkPossible(A, C, mid)) {
                ans = mid ;
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return ans;
    }


    boolean checkPossible(int D, ArrayList<Integer> C, int mid) {

        int count = 1;
        int sum = 0;
        for (Integer i : C) {
            sum += i;
            if (sum > mid) {
                count++;
                sum = i;
            }

        }

        if (count <= D) {
            return true;
        } else {
            return false;
        }


    }
}