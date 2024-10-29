package org.dsa.bitmanupulation;

public class CountingBits {


    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int r[] = countingBits.countBits(5);
        for (int i : r) {
            System.out.print(i + " ");
        }
    }


    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        int index = 0;
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                result[index] = result[i / 2];
                index++;
            } else {
                result[index] = result[i / 2] + 1;
                index++;
            }

        }

        return result;
    }
}
