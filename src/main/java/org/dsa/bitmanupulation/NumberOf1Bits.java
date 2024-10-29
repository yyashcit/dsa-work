package org.dsa.bitmanupulation;

public class NumberOf1Bits {

    public static void main(String[] args) {
        NumberOf1Bits obj = new NumberOf1Bits();
        int ans = obj.hammingWeight(2147483645);
        System.out.println("ans " + ans);
    }

    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }

            n = n / 2;

        }


/*
        if (n % 2 == 0) {
            int tempNum = n / 2;
            while (tempNum > 0) {
                if (tempNum % 2 == 1) {
                    count++;
                }

                tempNum = tempNum / 2;

            }
        } else {
            int tempNum = (n / 2) + 1;
            while (tempNum > 0) {

                if (tempNum % 2 == 1) {
                    count++;
                }
                tempNum = tempNum / 2;

            }
        }
*/
        return count;


    }
}
