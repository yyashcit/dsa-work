package org.dsa.scaler.array;

public class MaxOfSubArray {

    public static void main(String[] args) {
int[] A={3,8,8,9,7};
MaxOfSubArray obj=new MaxOfSubArray();
        System.out.println(obj.maxSubarray(5,7,A));
    }

    public int maxSubarray(int A, int B, int[] C) {
     int totalSum=0;




        if(A<=1)
        {
            if(B>=C[0]){
                totalSum=C[0];
            }

            return totalSum;
        }

            for(int i=0;i<A;i++)
        {

            for(int j=i+1;j<A;j++)
            {
                int sum=0;

                for(int k=i;k<=j;k++)
                {

                    sum+=C[k];
                    if(B>=sum&&totalSum<sum){
                        totalSum=sum;
                    }

                }
            }
           if(i==A-1){
            if(B>=C[i]){
                totalSum=C[i];
            }}
        }
        return totalSum;
    }

}
