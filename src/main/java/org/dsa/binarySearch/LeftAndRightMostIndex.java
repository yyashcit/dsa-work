package org.dsa.binarySearch;

public class LeftAndRightMostIndex {

    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 5, 5, 5, 16, 15, 10};

        int s = 0;
        int e = ar.length;
        int firstIndex = firstIndex(ar, s, e, 5);
        System.out.println(firstIndex);
    }

    private static int firstIndex(int[] ar, int s, int e, int target) {

        if (e > s) {

            int m=s+(e-s)/2;
            if(m==0||target==ar[m]&&target>ar[m-1])
            { return m;}
            else if(target>ar[m])
            {
               return firstIndex(ar,(m+1),e,5);
            }
            else {
              return  firstIndex(ar,s,(m-1),5);
            }

                   } else {

            return -1;
        }
    }
}
