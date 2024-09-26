package org.dsa.maths;

public class SquareRootOfNumber {
    public static void main(String[] args) {
       long ans= floorSqrt(5);
        System.out.println(ans);
    }

   static long floorSqrt(long n) {


        // Your code here

        long s=1;
        long e=n;
        long result=0;
        while(s<=e){
            long mid=(e+s)/2;
            if((mid*mid)>n)
            {
                e=mid-1;
            }
            else if((mid*mid)<n)
            {
                s=mid+1;
                result=mid;
            }else if((mid*mid)==n)
            {
                result=mid;
                break;
            }
        }
        return result;

    }
}
