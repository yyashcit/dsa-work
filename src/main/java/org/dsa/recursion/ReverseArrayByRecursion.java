package org.dsa.recursion;

public class ReverseArrayByRecursion {


    int index = 0;
    int i = 0;
    char[] result;
    boolean isTrue = true;

    public static void main(String[] args) {
        ReverseArrayByRecursion obj = new ReverseArrayByRecursion();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverse(s, 0, s.length - 1);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    void reverse(char[] x, int i, int j) {
        if (i < j) {//Swap
            char tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }
}

