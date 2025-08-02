package org.scalerAdaptive.leetCodeContest;

public class ProcessStringWithSpecialOperations {

    public static void main(String[] args) {
     ProcessStringWithSpecialOperations obj=new ProcessStringWithSpecialOperations();
        String s="%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";
        System.out.println(obj.processStr(s,6523));
    }

    public char processStr(String s,int k) {

        StringBuilder result=new StringBuilder();
    int peviousLength = 0;
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            int templen=result.length();
            if(Character.isAlphabetic(ch)){
                result.append(ch);
            }else if(ch=='*'){
                //String str=result.toString();
                if(!result.isEmpty()){
                    int len=result.length();
                    result.deleteCharAt(len-1);}
            }
            else if(ch=='#'){
                    if(peviousLength<templen){
                      result.append(result.substring(peviousLength,templen-1));
                        peviousLength=templen;
                    }
            }else if(ch=='%'){
                result.reverse();
            }

        }
        String finalResult = result.toString();
        System.out.println("final result: " + finalResult);
       long len=finalResult.length()% 1000000007;
        System.out.println("length "+len);
        return len>k?finalResult.charAt(k):'.';
    }
}
