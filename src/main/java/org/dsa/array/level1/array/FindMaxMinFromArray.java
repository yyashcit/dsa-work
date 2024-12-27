package org.dsa.array.level1.array;

public class FindMaxMinFromArray {

    public static void main(String[] args) {
        FindMaxMinFromArray obj= new FindMaxMinFromArray();

        int ar[]={1,5,9};
        System.out.println( obj.solve(ar));
    }

    public int solve(int[] A) {

        int max=A[0];
        int min=A[0];

        for(int i=0;i<A.length;i++)
        {

            if(max<A[i]){
                max=A[i];
            }

            if(min>A[i]){
                min=A[i];
            }
        }
        return max-Math.abs(min);
    }

}
