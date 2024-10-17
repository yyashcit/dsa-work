package org.dsa.recursion;

public class SubSequences {
    static int i = 0;

    public static void main(String[] args) {
        String s = "abc";
         getSubSequences(s, 0, "");

    }

    private static void getSubSequences(String s, int index, String newStr) {
        if (s.length() == index) {
            System.out.println(newStr);
            return;
        }
        char currChar = s.charAt(index);
        //if to be part
        getSubSequences(s, index+1, newStr + currChar);
        //if not to be part
        getSubSequences(s, index+1, newStr);
    }

}
