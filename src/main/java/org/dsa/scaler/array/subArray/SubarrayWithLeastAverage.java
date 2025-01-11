package org.dsa.scaler.array.subArray;

public class SubarrayWithLeastAverage {

    public static void main(String[] args) {
        // int[] A = {3, 7, 90, 20, 10, 50, 40};
        int[] A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};

        SubarrayWithLeastAverage obj = new SubarrayWithLeastAverage();
        System.out.println(obj.solve(A, 9));
    }

    public int solve(int[] A, int B) {

        int ans = 0;
        int avg = 0;
        int sum = 0;
        int tempSum = 0;

//create first window
        for (int i = 0; i < B; i++) {
            sum += A[i];

        }

        avg = sum / B;

        tempSum = sum;
        System.out.println("avg " + avg);
//create next windows
        int n = A.length;
        for (int i = 1; i < n - B + 1; i++) {
            sum = sum - A[i - 1] + A[i + B - 1];

            int tempAvg = sum / B;
            System.out.println("sum " + sum + " tempAvg " + tempAvg);
            if (sum < tempSum && avg >= tempAvg) {
                tempSum = sum;
                avg = tempAvg;

                ans = i;
            }

        }

        return ans;

    }
}
