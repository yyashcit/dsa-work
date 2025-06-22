package org.scalerAdaptive;

public class MinimumSwaps {

    public static void main(String[] args) {
     int[] A={1,12,10,3,14,10,5};
        int B=8;
            MinimumSwaps obj=new MinimumSwaps();
            System.out.println(obj.solve(A,B));
    }

    public int solve(int[] A, int B) {

        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]>B){

                for(int j=i+1;j<n;j++){

                    if(A[j]<B){
                        int temp=A[i];
                        A[i]=A[j];
                        A[j]=temp;
                        count++;
                        break; // Break after the first swap to ensure minimum swaps
                    }
                }

            }
        }
        return count;
    }


}
