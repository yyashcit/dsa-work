package org.dsa.scaler.array;

public class TrappingWater {

    public static void main(String[] args) {
        TrappingWater obj=new TrappingWater();
        int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(A));
    }

    public int trap(final int[] A) {

        int n=A.length;
        int[] preMax=new int[n];
        preMax[0]=A[0];
        for(int i=1;i<n;i++){
            preMax[i]=Math.max(preMax[i-1],A[i]);
        }


        int[] suffMax=new int[n];
        suffMax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            suffMax[i]=Math.max(suffMax[i+1],A[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(preMax[i],suffMax[i])-A[i];
        }
        return sum;


    }

}
