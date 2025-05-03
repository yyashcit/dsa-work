package org.dsa.scaler.hashing;

import java.util.HashSet;

public class FindPair {

    public static void main(String[] args) {
        FindPair obj=new FindPair();
        int[] B={35,16,70,33,32,89,59,79,84,64,59,30,98,25,23,58,57,83,3,4,80,38,87,63,44,70,93,65,72,34,69,96,96,48,5,70,73,58,82,62,49,97,91,40,28,56,61,93,47,14,93,75,90,91,3,48,99,41,49,32,26,34,50,25,2,58,50,84,14,76,77,28,46,52,33,71,74,40,55,41,32,4,66,35,9,71,45,95,55,78,85,1,43,57,16,68,15,1,0,51};
        System.out.println(obj.solve(0,B));
    }
    public int solve(int A, int[] B) {

        HashSet<Integer> hs=new HashSet();
        for(int i:B)
        {
            int x=A-i;

            if(hs.contains(x)){
                return 1;
            }else {hs.add(i);}
        }
        return 0;

    }

}
