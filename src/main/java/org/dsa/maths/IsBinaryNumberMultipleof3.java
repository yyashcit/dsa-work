package org.dsa.maths;

public class IsBinaryNumberMultipleof3 {

    public static void main(String[] args) {
int ans=isDivisible("11111110100");
        System.out.println(ans);
    }

  static   int isDivisible(String s) {
        // code here
        char[] ch=s.toCharArray();
        int index=0;
        int sum=0;
        int op=0;
        for(int i=ch.length-1;i>=0;i--)
        {
            int bn=Integer.parseInt(""+ch[i]);

            if(index==0){
                sum+=bn*1;
            }else{
                sum+=bn*(Math.pow(2,index));
            }
            index++;

            System.out.println("inside  "+sum);

        }
      System.out.println(sum);
        if(sum%3==0)
        {
            return 1;
        }
        return 0;
    }

}
