package org.dsa.recursion;

public class ToweOfHanoi {

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "D", "H");
    }

    public static void towerOfHanoi(int n, String src, String dest, String helper) {

        if (n == 1) {

            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
//transfer top n-1 from src to helper using dest as helper
        towerOfHanoi(n - 1, src,helper, dest );
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer top n-1  from helper to dest using src as helper
        towerOfHanoi(n - 1, dest, src, helper);


    }
}
