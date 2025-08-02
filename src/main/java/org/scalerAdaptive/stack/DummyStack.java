package org.scalerAdaptive.stack;

import java.util.ArrayList;
import java.util.Stack;

public class DummyStack {

    ArrayList<Integer> stack = new ArrayList<>();
    Stack<Integer> minStack = new Stack<>();
    int size = 0;
    int min = Integer.MAX_VALUE;

    public void push(int x) {

        stack.add(x);
        size++;
        // Maintain the minimum element
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }

    }

    public void pop() {
        if (size > 0) {
            int element = stack.get(size - 1);
   if (!minStack.isEmpty()&&element == minStack.peek()) {
                minStack.pop();
                stack.remove(size - 1);
                size--;
            } else {
                stack.remove(size - 1);
                size--;
            }
        }
    }

    public int top() {
        if (size > 0) {
            return stack.get(size - 1);

        } else {

            return -1; // or throw an exception
        }
    }

    public int getMin() {
        return !stack.isEmpty()&&!minStack.isEmpty()? minStack.peek(): stack.isEmpty()&&!minStack.isEmpty()?minStack.peek():-1;
    }

    public static void main(String[] args) {
        DummyStack stack = new DummyStack();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        System.out.println("Top element: " + stack.top()); // Should print 8
        System.out.println("Minimum element: " + stack.getMin()); // Should print 2
        stack.pop();
        System.out.println("Top element after pop: " + stack.top()); // Should print 2
    }
}
