package org.scalerAdaptive.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumOfAllWindows {

    public static void main(String[] args) {
        MaximumOfAllWindows obj = new MaximumOfAllWindows();
        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int B = 3;
        int[] result = obj.maxSlidingWindow(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private int[] maxSlidingWindow(int[] a, int b) {
    int[] result = new int[a.length - b + 1];
        Deque<Integer> deque = new ArrayDeque<>();
    //first window
        for(int i=0; i < b; i++) {
            while(!deque.isEmpty() && deque.peekLast() < a[i]) {
                deque.pollLast();
            }
            deque.offerLast(a[i]);
        }
    result[0] = deque.peekFirst();

        //remaining window
        int s=1;
        int e=b;
        while(e<a.length){
            //remove impact of first element of previous window
            if(!deque.isEmpty()&&deque.peekFirst()==a[s-1]){
                deque.removeFirst();
            }

            //add new element to the deque
            while(!deque.isEmpty() && deque.peekLast() < a[e]) {
                deque.pollLast();
            }
            deque.offerLast(a[e]);
            result[s] = deque.peekFirst();
            s++;
            e++;

        }
    return result;
    }
}
