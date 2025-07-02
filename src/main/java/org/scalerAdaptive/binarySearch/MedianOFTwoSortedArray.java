package org.scalerAdaptive.binarySearch;

public class MedianOFTwoSortedArray {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {3,4};
        MedianOFTwoSortedArray obj = new MedianOFTwoSortedArray();
        System.out.println(obj.findMedianSortedArrays(A, B));
    }

    private int findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        if (n > m) {
            return findMedianSortedArrays(b, a); // Ensure a is the smaller array
        }

        int low = 0, high = n;
        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : a[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : a[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : b[partitionB - 1];
            int minRightB = (partitionB == m) ? Integer.MAX_VALUE : b[partitionB];




            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Found the correct partition
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Move towards left in A
                high = partitionA - 1;
            } else {
                // Move towards right in A
                low = partitionA + 1;
            }}
        return -1; // No valid partition found

    }
}
