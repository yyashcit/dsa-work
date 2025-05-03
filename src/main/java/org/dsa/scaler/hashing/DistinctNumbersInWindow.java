package org.dsa.scaler.hashing;

import java.util.HashMap;

public class DistinctNumbersInWindow {

/*    You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct
numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
    NOTE: if B > N, return an empty array.*/

    public static void main(String[] args) {
DistinctNumbersInWindow obj=new DistinctNumbersInWindow();
int[] A={1,2,1,3,4,4};
A=obj.dNums(A,3);
for(int i:A){

    System.out.print(i+" ");
}
    }
    public int[] dNums(int[] A, int B) {
        int n = A.length;
        int[] ans = new int[n - B + 1];
        HashMap<Integer , Integer> map = new HashMap<>();
//1st window
        for(int i = 0; i < B; i++){
            if(map.containsKey(A[i])){
                map.put(A[i] , map.get(A[i]) + 1);
            }
            else{
                map.put(A[i] , 1);
            }
        }



        ans[0] = map.size();
        int s = 1 , e = B;
        while(e < n){

            //remove impact of A[s-1] from HashMap
            map.put(A[s-1] , map.get(A[s - 1]) - 1);
            if( map.get(A[s-1]) == 0){
                map.remove(A[s - 1]);
            }

            //Add impact of A[e] in HashMap
            if(map.containsKey(A[e])){
                map.put(A[e] , map.get(A[e]) + 1);
            }
            else{
                map.put(A[e] , 1);
            }
            ans[s] = map.size();
            s++;
            e++;
        }
        return ans;
    }

}
