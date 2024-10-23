package org.dsa.recursion;

import java.util.ArrayList;

public class GetKeypadCombination {
    String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        GetKeypadCombination obj = new GetKeypadCombination();
        String ip = "678";
        ArrayList<String> ans = obj.getKeypadCombination(ip);
        System.out.println(ans);
    }

    ArrayList<String> getKeypadCombination(String ip) {
        if(ip.length()==0)
        {
            ArrayList<String> bAl=new ArrayList<>();
            bAl.add("");
            return bAl ;
        }
        char ch=ip.charAt(0);
        String rofs=ip.substring(1);
        ArrayList<String> recresult=getKeypadCombination(rofs);
        ArrayList<String> myResultList=new ArrayList<>();
        System.out.println(ch);
        String code=codes[ch-'0'];
        for (int i=0;i<code.length();i++)
        {
            char c=code.charAt(i);
            for(String str:recresult){
                myResultList.add(c+str);
            }
        }
        return myResultList;
    }

}
