package org.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
       int ans= fact(n);
    }

    private static int fact(int n) {
        if(n==1)
        {
            return 1;
        }
        int nm1= fact(n-1);
        System.out.println("nm1 "+nm1);
        System.out.println("n "+n);
        int fn=n*nm1;
        System.out.println("fn------- "+fn);

        //fn se jo return hoga wo line number 14 pr nm1 receive krega
        return fn;
    }
}
