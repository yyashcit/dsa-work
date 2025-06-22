package org.scalerAdaptive.binarySearch;

public class KokoEatingBanana {

    public static void main(String[] args) {
        int[] A = {3, 6, 7, 11};
        int B = 8;
        KokoEatingBanana obj = new KokoEatingBanana();
        System.out.println(obj.solve(A, B));
    }
   int solve(int[] A, int B) {
        int l = 1; // Minimum speed can be 1 banana per hour
        int h = Integer.MIN_VALUE;

        for (int i : A) {
            h = Math.max(h, i);
        }

        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (checkPossible(A, B, mid)) {
                ans = mid;
                h = mid - 1; // Try to find a smaller speed
            } else {
                l = mid + 1; // Increase speed
            }
        }
        return ans;
    }

    private boolean checkPossible(int[] piles, int h, int m) {

        int countH=0;

        for(int i=0;i<piles.length;i++){

            if(piles[i]<=m){
                countH++;
            }else {
                int temp=piles[i]-m;
                while(temp>0){
                    temp=temp-m;
                    countH++;
                }
            }
        }
        return countH<=h;

    }
}
