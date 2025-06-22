package org.scalerAdaptive.binarySearch;

public class PainterPartision {
    public static void main(String[] args) {
int[] C={1000000,1000000};
        int A=1;
        int B=1000000;
        PainterPartision obj=new PainterPartision();
        System.out.println(obj.paint(A,B,C));
    }
    public int paint(int A, int B, int[] C) {

        int l=0;
        int h=0;
        for(int i:C){

            l=Math.max(l,i);
            h+=i;
        }

        int ans=0;
        while(l<=h){

            int mid=l+(h-l)/2;

            if(checkPossible(C, A,mid)){
                ans=mid*B;
                h=mid-1;
            }else {
                l=mid+1;
            }
        }

        return ans % 10000003;
    }
    boolean checkPossible(int[] A,int P,int mid)
    {
        int painter=1;
        int currSum=0;
        for(int i=0;i<A.length;i++){
            currSum+=A[i];
            if(currSum>mid){
                currSum=A[i];
                painter++;
            }
        }
        return painter<=P;
    }

}
