package org.scalerAdaptive.stack;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectanglenHistogram {
    public static void main(String[] args) {
        LargestRectanglenHistogram obj = new LargestRectanglenHistogram();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(8);
        /*A.add(6);
        A.add(2);
        A.add(5);
        A.add(6);
        A.add(5);
        A.add(7);
        A.add(4);*/
        int result = obj.largestRectangleArea(A);
        System.out.println(result); // Expected output: 10
    }

    public int largestRectangleArea(ArrayList<Integer> A) {

        //find min at left[i]
        //right[i]-left[i]-1  -> len if rightSize min not available then min=n

        //A[i] =height

        //ans= len + height
        int ans = 0;
        ArrayList<Integer> left = nearestSmallerAtLeft(A);
        ArrayList<Integer> right = nearestSmallerAtRight(A);
        System.out.println(A);

        System.out.println(left);
        System.out.println(right);

        for (int i = 0; i < A.size(); i++) {

            int len = right.get(i) - left.get(i) - 1;
            int height = A.get(i);
            int recLen = len * height;
            ans = Math.max(ans, recLen);
        }
        return ans;
    }

    ArrayList<Integer> nearestSmallerAtRight(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> rightSmallerList = new ArrayList();
        Stack<Integer> stk = new Stack();
        for (int i = n - 1; i >= 0; i--) {

            while (!stk.isEmpty() && A.get(stk.peek()) >= A.get(i)) {
                stk.pop();

            }
            if (!stk.isEmpty()) {
                rightSmallerList.add(stk.peek());
                stk.push(i);
            } else {
                stk.push(i);
                rightSmallerList.add(n);
            }
        }

        return rightSmallerList;


    }

    ArrayList<Integer> nearestSmallerAtLeft(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> leftSmallerList = new ArrayList();
        Stack<Integer> stk = new Stack();
        for (int i = 0; i < n; i++) {

            while (!stk.isEmpty() && stk.peek() >= A.get(i)) {
                stk.pop();

            }
            if (!stk.isEmpty()) {
                leftSmallerList.add(stk.peek());
                stk.push(i);
            } else {
                stk.push(i);
                leftSmallerList.add(-1);
            }
        }

        return leftSmallerList;

    }
}
