package org.dsa.scaler.array;

public class SpecialIndex {


    public static void main(String[] args) {
        SpecialIndex obj = new SpecialIndex();
        //int [] A={2,3,1,4,0,-1,2,-2,10,8};
        int[] A = {1, 1, 1};
        System.out.println("final output " + obj.solve(A));
    }

    public int solve(int[] A) {
        int n = A.length;
        int[] pEsum = new int[n];
        int[] pOSum = new int[n];
        if (n == 0) {
            return 0;
        }
        int eIdx = 0;
        int oIdx = 0;

//prepare prefixEvenArray
        pEsum[0]=A[0];
        for (int i = 1; i < n; i ++) {

            if(i%2==0){
                pEsum[i]=pEsum[i-1]+A[i];
            }else {
                pEsum[i]=pEsum[i-1]+0;
            }
        }


//--------------------------------------------------
//prepare prefixOddArray
        pOSum[0]=0;
        for (int i = 1; i < n; i ++) {
            if(i%2==1){
                pOSum[i]=pOSum[i-1]+A[i];
            }else {
                pOSum[i]=pOSum[i-1]+0;
            }
        }
//------------------------------------------------------------
        int count = 0;

        for (int i = 0; i < n; i++) {

            int sumOfEven = pOSum[n - 1] - pOSum[i];
            if (i > 0) {
                sumOfEven = sumOfEven + pEsum[i - 1];
            }
            int sumOfOdd = pEsum[n - 1] - pEsum[i];
            if (i > 0) {
                sumOfOdd = sumOfOdd + pOSum[i - 1];
            }
            if (sumOfEven == sumOfOdd) {

                count++;
            }
        }
        return count;
    }
}
