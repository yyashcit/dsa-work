package org.scalerAdaptive.twopointer;

import java.util.ArrayList;

public class FindSubarrayWthGivenSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> A = new ArrayList<>();
        for (int num : arr) {
            A.add(num);
        }
        int k = 5;
        System.out.println(solve(A, k));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {


        int n=A.size();
        int i=0;
        int j=0;
        int sum=0;
        ArrayList<Integer> ans=new ArrayList();

        while(i<n&&j<n){

            if(sum==B){

                for(int k=i;k<j;k++){
                    ans.add(k);
                }
                break;
            }else if(sum<B){
                sum+=A.get(j);
                j++;
            }else if(sum>B){
                sum-= A.get(i);
                i++;
            }else {
                j++;
            }

        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
