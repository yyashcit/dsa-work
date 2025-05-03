package org.dsa.scalerreset;

public class MinimumSwap {

    public static void main(String[] args) {

        int[] A={52,93,7,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
        int B=19;
        MinimumSwap obj=new MinimumSwap();

        System.out.println(obj.minimumSwap(A,B));

    }

int minimumSwap(int[] A, int B) {
    int n = A.length;
    int k = 0;

    // Count elements less than or equal to B
    for (int i = 0; i < n; i++) {
        if (A[i] <= B) {
            k++;
        }
    }

    // Count elements greater than B in the first k elements
    int bad = 0;
    for (int i = 0; i < k; i++) {
        if (A[i] > B) {
            bad++;
        }
    }

    // Sliding window to find the minimum swaps
    int minSwaps = bad;
    for (int i = 0, j = k; j < n; i++, j++) {
        if (A[i] > B) {
            bad--;
        }
        if (A[j] > B) {
            bad++;
        }
        minSwaps = Math.min(minSwaps, bad);
    }

    return minSwaps;
}}
