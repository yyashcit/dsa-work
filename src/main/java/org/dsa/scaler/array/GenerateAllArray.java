package org.dsa.scaler.array;

import java.util.ArrayList;

public class GenerateAllArray {

    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList();

        int n=A.size();

        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> innerAl=new ArrayList();
            for(int j=i;j<n;j++){

                innerAl.add(A.get(j));
            }
            ans.add(innerAl);
        }
        return ans;



    }
}
