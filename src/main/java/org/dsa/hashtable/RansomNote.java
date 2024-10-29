package org.dsa.hashtable;

import java.util.Hashtable;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote obj=new RansomNote();
        boolean ans=obj.canConstruct("aa","aab");
        System.out.println(ans);
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        boolean result=true;
        int valConter=0;
        for(int i=0;i<magazine.length();i++) {
            if (hashtable.containsKey(magazine.charAt(i))) {
                hashtable.put(magazine.charAt(i), hashtable.get(magazine.charAt(i))+1);
            }else{
                hashtable.put(magazine.charAt(i), 1);

            }
        }
for(int i=0;i<ransomNote.length();i++)
{
    char c=ransomNote.charAt(i);

    if(hashtable.containsKey(c)&&hashtable.get(c)>0){
        //hashtable.put(c,hashtable.get(c)-1);
        valConter++;
    }
    else {
        return  false;
    }

}

return valConter==ransomNote.length()?true:false;

    }
}
