package org.dsa.scaler.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllSubArrayFromArray {

    public static void main(String[] args) {
        GetAllSubArrayFromArray obj = new GetAllSubArrayFromArray();
        ArrayList<Integer> ip = new ArrayList();
        ip.add(1);
        ip.add(2);
        ip.add(3);
        System.out.println(obj.solve(ip));
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList();

        int n = A.size();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> innerAl = new ArrayList();

                for (int k = i; k <= j; k++) {
                    innerAl.add(A.get(k));
                }
                ans.add(innerAl);

            }
        }
        return ans;


    }
}
