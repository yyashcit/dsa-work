package org.dsa.scaler.binarySearch;

public class SortedInsertPosition {


    public static void main(String[] args) {
        SortedInsertPosition obj = new SortedInsertPosition();
        //int[] A = {1, 3, 5, 6};
        int[] A =  {11, 106, 143, 222, 247, 248, 310, 311, 399, 415, 450, 495, 575, 658, 813, 818, 855, 986};
        System.out.println(obj.searchInsert(A, 77));
    }

    public int searchInsert(int[] A, int B) {

        System.out.println("inside searchInser");
        int n = A.length;
        int result = n;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (A[m] == B) {
                result = m;
                break;
            } else if (A[m] > B) {

                e = m - 1;
            } else {

                s = m + 1;
            }

        }
        if (result == n) {
            s = 0;
            e = n - 1;

            while (s <= e) {

                int m = s + (e - s) / 2;

                if (m>0&&A[m] >= B&&A[m-1] <= A[m]) {
                    result = m;
e=m-1;
                } else {

                    s = m + 1;
                }
            }
        }

        return result;
    }
}
