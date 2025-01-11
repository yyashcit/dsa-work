package org.dsa.scaler.array.subArray;

import java.util.ArrayList;

public class GenerateAllArray {

    public static void main(String[] args) {
GenerateAllArray obj=new GenerateAllArray();
        int[] A={1, 2, 3};
        System.out.println(obj.solve(A));
    }
    public int[][] solve(int[] A) {
        int n=A.length;
        int ansLeng=n*n;;
        int [][] ans=new int[ansLeng][ansLeng];
        for(int i=0;i<n;i++)
        {

            for(int j=i;j<n;j++){
                //ans=new int[j][];

                int cl=0;
                ans=new int[ansLeng][j+1];
                for(int k=i;k<=j;k++){
                    ans[i][cl]=A[k];
                    cl++;

                }

            }
        }
        return ans;
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
