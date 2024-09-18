package org.dsa.string;

public class  LongestCommonPrefix {

    public static void main(String[] args) {
//String[] strs = {"flower","flow","aighte"};
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        int maxIndex = 0;
        int maxSizeStr = 0;

        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()==0 )
            if (strs[i].length() > maxSizeStr) {

                maxSizeStr = strs[i].length();
                maxIndex = i;
            }
            if(strs[i].length()==0 ){
                maxIndex=0;
                break;
            }

        }
        String inputStr = strs[maxIndex];
        String result = "";
        int count = 0;
        char[] ch = inputStr.toCharArray();
        for (int i = 0; i < inputStr.toCharArray().length; i++) {
            result += ch[i];
            for (int j = 0; j < strs.length; j++) {

                if (strs[j].length() >= result.length()) {
                    String temp = "";
                    for (int k = 0; k < result.length(); k++) {
                        temp += strs[j].toCharArray()[k];
                    }
                    if (!temp.equals(result)) {
                        result.toCharArray();
                       return result.substring(0,result.length()-1);
                    }


                } else {
                    return result.substring(0,result.length()-1);
                }

            }
        }

        return result;
    }
}
