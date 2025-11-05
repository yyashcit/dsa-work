package org.scalerAdaptive.string;

public class ReverseStrWithoutchangeIndex {

    public static void main(String[] args) {
        String str="yogesh#verma#dws";

        StringBuilder sb=new StringBuilder();
        String strArr[]=str.split("#");
        for(int i=strArr.length-1;i>=0;i--){
         StringBuffer revStr=reverseString(strArr[i]);
            sb.append(revStr);
            if(i!=0){
                sb.append("#");
            }
        }
        System.out.println(sb);
    }

    private static StringBuffer reverseString(String s) {
        StringBuffer sb=new StringBuffer(s);
        return sb.reverse();
    }
}
