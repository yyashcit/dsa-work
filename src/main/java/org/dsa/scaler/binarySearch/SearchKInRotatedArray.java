package org.dsa.scaler.binarySearch;

import org.dsa.scaler.array.twoDArray.SearchKInSortedMatrix;

public class SearchKInRotatedArray {

    public static void main(String[] args) {
        SearchKInRotatedArray obj = new SearchKInRotatedArray();

        int[] A = {10, 11, 12, 13, 17, 20, 23, 25, 26, 1, 3, 5, 6, 8};
        System.out.println("ans " + obj.search(A, 5));
    }


    public int search(final int[] A, int B) {
        int n = A.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (A[m] == B) {
                return m;
            } else if (A[s] <= A[m]) {
                if (A[s] <= B && B < A[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (A[m] < B && B <= A[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return -1;
    }
}
