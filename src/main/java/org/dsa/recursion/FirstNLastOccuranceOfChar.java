package org.dsa.recursion;

public class FirstNLastOccuranceOfChar {

    public static void main(String[] args) {
        String input = "harrwjalsiabhap";

        findFirstAndLastOccurance(input, 'a', 0, -1, -1);
    }

    static void findFirstAndLastOccurance(String s, char ip, int index, int firstIndex, int lastIndex) {

        if (s.length() - 1 < index) {
            System.out.println("firstOccurance " + firstIndex + " lastOccurance " + lastIndex);
            return;
        }
        if (ip == s.charAt(index)) {
            if (firstIndex == -1) {
                firstIndex = index;
            } else {
                lastIndex = index;
            }
        }
        index++;
        findFirstAndLastOccurance(s, ip, index, firstIndex, lastIndex);
        //System.out.println(index);
    }
}