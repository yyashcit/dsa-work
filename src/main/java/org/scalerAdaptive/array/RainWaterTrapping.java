package org.scalerAdaptive.array;

public class RainWaterTrapping {
    public static void main(String[] args) {

        String s="HelloWorld!";
        for(int i=0;i<s.length();i++){
            System.out.print(s.substring(i,i+1)+" "); // Output: H e l l o W o r l d !
        }

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        RainWaterTrapping obj = new RainWaterTrapping();
        System.out.println(obj.trap(height)); // Output: 6
    }
    public int trap(int[] A) {

        int totalTrapWater=0;
        int n=A.length;
        int[] leftSum=new int[n];

        int max=-1;
        for(int i=0;i<n;i++){

            max=Math.max(max,A[i]);
            leftSum[i]=max;

        }
        int[] rightSum=new int[n];

         max=-1;
        for(int i=n-1;i>=0;i--){

            max=Math.max(max,A[i]);
            rightSum[i]=max;
        }

        for(int i=0;i<n;i++){

            totalTrapWater+= Math.max(Math.min(leftSum[i]-A[i], rightSum[i]-A[i]) ,0);
        }
        return totalTrapWater;
    }
}
