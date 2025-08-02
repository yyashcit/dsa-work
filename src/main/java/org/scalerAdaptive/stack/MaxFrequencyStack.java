package org.scalerAdaptive.stack;

import java.util.*;

public class MaxFrequencyStack {

    List<Stack<Integer>> stackList;
    Map<Integer, Integer> map;

    public static void main(String[] args) {
        MaxFrequencyStack maxFrequencyStack = new MaxFrequencyStack();
        maxFrequencyStack.push(5);
        maxFrequencyStack.push(7);
        maxFrequencyStack.push(5);
        maxFrequencyStack.push(7);
        maxFrequencyStack.push(4);
        maxFrequencyStack.push(5);
        System.out.println(maxFrequencyStack.pop()); // 5
        System.out.println(maxFrequencyStack.pop()); // 7
        System.out.println(maxFrequencyStack.pop()); // 5
        System.out.println(maxFrequencyStack.pop()); // 4
    }
    public MaxFrequencyStack() {
        stackList = new ArrayList();
        map = new HashMap<Integer, Integer>();
    }

    public void push(int x) {
        if (!map.containsKey(x)) {
            map.put(x, 0);
        }
        map.put(x, map.get(x) + 1);
        if (stackList.size() < map.get(x)) {
            stackList.add(new Stack<Integer>());
        }
        stackList.get(map.get(x) - 1).push(x);
    }

    public int pop() {
        int res = stackList.get(stackList.size() - 1).pop();
        map.put(res, map.get(res) - 1);
        if (stackList.get(stackList.size() - 1).isEmpty()) {
            stackList.remove(stackList.size() - 1);
        }
        return res;
    }
}
