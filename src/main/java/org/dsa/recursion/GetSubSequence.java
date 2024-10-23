package org.dsa.recursion;

import java.util.ArrayList;

public class GetSubSequence {

    public static void main(String[] args) {
        String ip = "abc";
        ArrayList<String> result = getSubSequence(ip);
        System.out.println(result);
    }

    private static ArrayList<String> getSubSequence(String ip) {

        if (ip.length() == 0) {
            ArrayList<String> li = new ArrayList();
            li.add("");
            return li;
        }
        char ch = ip.charAt(0);
        String ros = ip.substring(1);
        ArrayList<String> myAl = getSubSequence(ros);
        ArrayList<String> result = new ArrayList<>();
        for (String s : myAl) {
            result.add("-" + s);
            result.add(ch + s);
        }
        return result;

    }
}
