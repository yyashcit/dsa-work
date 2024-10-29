package org.dsa.bitmanupulation;

public class AddTwoBinary {

    public static void main(String[] args) {
        AddTwoBinary obj=new AddTwoBinary();
    String ans=    obj.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(ans);
    }

    public String addBinary(String a, String b) {
        int sum1 = 0;
        int sum2 = 0;
        int totalSum = 0;
        int p = 0;
        String result = "";

        int pointer1=a.length()-1;
        int pointer2=b.length()-1;
        while(pointer1>=0)
        {
           int r= a.charAt(pointer1)-'0';
            sum1 += r * Math.pow(2, p);
            pointer1--;
            p++;
        }
        p=0;
        while(pointer2>=0)
        {
            int r= b.charAt(pointer2)-'0';
            sum2 += r * Math.pow(2, p);
            pointer2--;
            p++;
        }
        System.out.println("sum1 "+sum1+" sum2 "+sum2);
        totalSum = sum1 + sum2;
        int tempTotal=totalSum;
        while (totalSum > 0) {
            int r = totalSum % 2;
            totalSum = totalSum / 2;
            result += r;

        }
        String output = "";
        if (tempTotal > 0) {

            for (int i = result.length() - 1; i >= 0; i--) {
                output += result.charAt(i);
            }
        } else {
            output = "0";
        }
        return output;
    }
}