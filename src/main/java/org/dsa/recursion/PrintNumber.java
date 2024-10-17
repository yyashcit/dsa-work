package org.dsa.recursion;

public class PrintNumber {

    public static void main(String[] args) {
        printN(7);
    }
    static void printN(int n)
    {
        if(n==1)
        {
          //  System.out.println("n "+n);
            return;
        }
        System.out.println(n);
    printN(n-1);

    }
}
