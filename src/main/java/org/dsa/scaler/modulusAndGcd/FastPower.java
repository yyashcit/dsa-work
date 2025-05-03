package org.dsa.scaler.modulusAndGcd;

public class FastPower {

    public static void main(String[] args) {
FastPower obj=new FastPower();
        System.out.println(obj.pow(2,3,3));
    }

    public int pow(int A, int B, int C) {
        if(A==0){
            return 0;
        }

        if(B==0){
            return 1;
        }
        long y=pow(A,B,C);
        System.out.println("y "+y);
        if(B%2==0){
            return (int)((y*y)%C);
        }else {
            return (int)((y*y*A)%C);
        }
    }

}
