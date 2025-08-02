package org.scalerAdaptive.stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxMinDifferenceSum {
    public static void main(String[] args) {
        MaxMinDifferenceSum obj = new MaxMinDifferenceSum();
        int[] A = {4, 7, 3, 8};
        int result = obj.solve(A);
        System.out.println(result); // Expected output: sum of max-min differences
    }
    public int solve(int[] A) {

        int[] gl=nearestGreatestLeft(A);
        int[] gr=nearestGreatestRight(A);
        int[] sl=nearestSmallestLeft(A);
        int[] sr=nearestSmallestRight(A);

        Arrays.stream(gl)
                .forEach(e-> System.out.print(e+" "));
        System.out.println();
        Arrays.stream(gr)
                .forEach(e-> System.out.print(e+" "));
        System.out.println();
        Arrays.stream(sl)
                .forEach(e-> System.out.print(e+" "));
        System.out.println();
        Arrays.stream(sr)
                .forEach(e-> System.out.print(e+" "));
        System.out.println();
        int sum=0;
        for(int i=0;i<A.length;i++){

            int max=(i-gl[i])*(gr[i]-i)*A[i];
            int min=(i-sl[i])*(sr[i]-i)*A[i];

            sum+=(max-min);
        }
        return sum;
    }


    int[]   nearestGreatestLeft(int[] A)
    {

        int[] gl=new int[A.length];
        Stack<Integer> stk=new Stack();
        for(int i=0;i<A.length;i++){

            while(!stk.isEmpty()&&stk.peek()<=A[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                gl[i]=stk.peek();
                stk.push(A[i]);
            }else {
                gl[i]=-1;
                stk.push(A[i]);
            }

        }
        return gl;
    }
    int[]   nearestGreatestRight(int[] A)
    {
        int[] gr=new int[A.length];
        Stack<Integer> stk=new Stack();
        for(int i=A.length-1;i>=0;i--){

            while(!stk.isEmpty()&&stk.peek()<=A[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                gr[i]=stk.peek();
                stk.push(A[i]);
            }else {
                gr[i]=-1;
                stk.push(A[i]);
            }

        }
        return gr;

    }


    int[]   nearestSmallestLeft(int[] A)
    {
        int[] sl=new int[A.length];
        Stack<Integer> stk=new Stack();
        for(int i=0;i<A.length;i++){

            while(!stk.isEmpty()&&stk.peek()>=A[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                sl[i]=stk.peek();
                stk.push(A[i]);
            }else {
                sl[i]=-1;
                stk.push(A[i]);
            }

        }
        return sl;

    }
    int[]   nearestSmallestRight(int[] A)
    {

        int[] sr=new int[A.length];
        Stack<Integer> stk=new Stack();
        for(int i=A.length-1;i>=0;i--){

            while(!stk.isEmpty()&&stk.peek()>=A[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                sr[i]=stk.peek();
                stk.push(A[i]);
            }else {
                sr[i]=-1;
                stk.push(A[i]);
            }

        }
        return sr;

    }

}
