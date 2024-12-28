package org.dsa.scaler.sorting;

public class FindKthSmallestElement {

    public static void main(String[] args) {
        FindKthSmallestElement obj = new FindKthSmallestElement();
        int[] B = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};

        int[] A = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};

        int k = 9;

        System.out.print("kth smallest where k ="+k+" ans "+obj.kthsmallest(A, k));
    }

    public int kthsmallest(final int[] A, int B) {

        int n = A.length;
        int count = 0;
        int ans = A[0];
        for (int i = 0; i < n; i++) {

            int miniIndex = i;
            for (int j = i + 1; j < n; j++) {

                if (A[j] < A[miniIndex]) {
                    miniIndex = j;

                }
            }
            System.out.print(A[miniIndex]+",");
            count++;
            swap(A,miniIndex,i,B);
            if (B == count) {

                ans = A[B-1];
                break;
            }

        }
        System.out.println();
        return ans;
    }

    public static void  swap(int[] A,int miniIndex,int i,int B){

        int temp=A[miniIndex];
        A[miniIndex]=A[i];
        A[i]=temp;
    }
}
