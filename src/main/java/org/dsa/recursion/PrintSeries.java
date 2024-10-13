package org.dsa.recursion;

public class PrintSeries {

    public static void main(String[] args) {
        print(16, 16);
    }

    public static int print(int n, int o) {
        if (n < 0) {
            System.out.print(n);
            return n;
        }
        int i = print(n - 5, o);
        System.out.print(i + " ");

        if (n == o || n < 0) {
            System.out.print(n);
            return n;
        }

        int j = print(n + 5, o);
        System.out.print(j + " ");
        return j;
    }
}
