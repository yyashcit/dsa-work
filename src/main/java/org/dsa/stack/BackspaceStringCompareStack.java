package org.dsa.stack;

import java.util.Stack;

/*https://leetcode.com/problems/backspace-string-compare/description/*/

public class BackspaceStringCompareStack {

    public static void main(String[] args) {
        BackspaceStringCompareStack obj=new BackspaceStringCompareStack();
       boolean ans =obj.backspaceCompare("ab#c","ad#c");
        System.out.println(ans);
    }

    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
