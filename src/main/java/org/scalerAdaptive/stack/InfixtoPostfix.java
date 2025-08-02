package org.scalerAdaptive.stack;

import java.util.Stack;

public class InfixtoPostfix {
    public static void main(String[] args) {
        InfixtoPostfix obj = new InfixtoPostfix();
        String A = "a+b*c-d/e";
        String result = obj.infixToPostFix(A);
        System.out.println(result); // Expected output: "abc*+de/-"
    }

    public String infixToPostFix(String A) {

        String result = "";
        String operators = "+-*/^";
        String brackets = "()";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (Character.isLetter(ch) || ch == '(') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }


        }
        return result;

    }
}
