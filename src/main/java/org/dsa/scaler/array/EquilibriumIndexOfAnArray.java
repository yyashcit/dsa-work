package org.dsa.scaler.array;

public class EquilibriumIndexOfAnArray {

    public static void main(String[] args) {
        EquilibriumIndexOfAnArray obj = new EquilibriumIndexOfAnArray();
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
int n=A.length;
int[] sufAr=new int[A.length];
sufAr[n-1]=A[n-1];

for(int i=n-2;i>=0;i++)
{
    sufAr[i]=sufAr[i]+A[i-1];
}




        System.out.println(obj.solve(A));
    }

    public int solve(int[] A) {

        int sumLw = 0;
        int sumhi = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            sumLw += A[i];

            for (int j = i + 1; j < n; j++) {
                count++;
                sumhi += A[j];
                if (sumLw == sumhi) {
                    return count;
                }
            }


            sumhi = 0;
            count = 0;
        }
        return 0;
    }
}
