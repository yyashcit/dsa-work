package org.scalerAdaptive.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {

    }
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {


        ArrayList<Integer> ans=new ArrayList();
        Stack<Integer> stk=new Stack();
        for(int i=A.size()-1;i>=0;i--){


            while(!stk.isEmpty()&&stk.peek()>=A.get(i)){
                stk.pop();

            }
            int element= stk.isEmpty()?-1:stk.peek();
            ans.add(i,element);
            stk.push(A.get(i));
        }
        return ans;
    }
}
