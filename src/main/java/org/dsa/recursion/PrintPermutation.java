package org.dsa.recursion;

import java.util.ArrayList;

public class PrintPermutation {


    public static void main(String[] args) {
        String ip = "abcd";
        getPermutation(ip, "");
        }

    private static void getPermutation(String ip, String asf) {
        if (ip.length() == 0) {
            System.out.print(asf+" ");
            return;
        }
        for (int i = 0; i < ip.length(); i++) {
            char c = ip.charAt(i);
            String leftStr = ip.substring(0, i);
            String rgtStr = ip.substring(i + 1);
            getPermutation(leftStr + rgtStr, asf + c);
        }


        return;
    }
}
