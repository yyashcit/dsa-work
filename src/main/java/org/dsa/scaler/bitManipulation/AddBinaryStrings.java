package org.dsa.scaler.bitManipulation;

public class AddBinaryStrings {

    public static void main(String[] args) {
       String A = "1010110111001101101000";
       String B = "1000011011000000111100110";
       AddBinaryStrings obj=new AddBinaryStrings();
       //System.out.println(obj.addBinary(A,B));
obj.printTimer(10);


    }
    void printTimer(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        System.out.println(n);
        printTimer(n-1);

    }
    public String addBinary(String A, String B) {

        //   StringBuffer ansSF=new StringBuffer();
        String ansStr = "";
        long carray = 0;
        int n1 = A.length() - 1;
        int n2 = B.length() - 1;
        while (n1 >= 0 || n2 >= 0 || carray > 0) {

            int sum = 0;
            if (n1 >= 0) {
                sum += A.charAt(n1) - '0';
                n1--;
            }
            if (n2 >= 0) {
                sum += B.charAt(n2) - '0';
                n2--;
            }
            sum+=carray;
            int bit = sum % 2;
            carray = sum / 2;

            char chBit = (char) (bit + '0');
            System.out.println("bit " + bit + " chBit " + chBit);
            ansStr += chBit;
        }
        StringBuffer sb = new StringBuffer(ansStr);
        return sb.reverse().toString();
    }
}