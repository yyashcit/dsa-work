package org.dsa.string;

import java.util.Arrays;

public class  LongestCommonPrefix {

    public static void main(String[] args) {
//String[] strs = {"flower","flow","aighte"};
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String min = strs[0];
        String max = strs[strs.length - 1];
        String result = "";
        for (int i = 0; i < min.length(); i++)

        {

            if (min.charAt(i) == max.charAt(i)) {
                result += min.charAt(i);
            }

        }

        return result;
    }

}