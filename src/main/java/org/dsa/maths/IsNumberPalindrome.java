package org.dsa.maths;

public class IsNumberPalindrome {

    public static void main(String[] args) {
        IsNumberPalindrome obj = new IsNumberPalindrome();
        boolean ans = obj.isPalindrome(1000000001);
        System.out.println(ans);
    }

    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            rev += rem;
            rev = rev * 10;
        }
        rev = rev / 10;
        System.out.println(rev);

        return rev == temp ? true : false;
    }
}
