package org.dsa2.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

 class PartitionStringTest {
 static int idx = -1;
String ansStr="";
    public static void main(String[] args) {

        List<String> ans = new ArrayList<>();
        String s = "abbccccd";
        HashSet<String> set = new HashSet<>();
        int j=0;
        for(int i = 0; i < s.length(); i++) {

            String subStr = s.substring(i, i + 1);
            if (!checkMyString(subStr, set, s, i, i+1)) {
                  ans.add(subStr);
        i =idx;
            }else {

                ans.add(subStr);
            }

            }
        System.out.println(ans);

        }

     public static    boolean checkMyString(String subStr, HashSet set,String s,int i,int j) {
            if (j >= s.length()) {
                return true;
            }
         if(set.contains(subStr)) {

             subStr=s.substring(i, j + 1);
             checkMyString(subStr, set, s, i , j + 1);
         }else {
             set.add(subStr);
             idx = subStr.length();
             return false;

         }
         return true;
     }

    }


