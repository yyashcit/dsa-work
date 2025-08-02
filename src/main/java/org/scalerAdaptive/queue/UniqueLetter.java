package org.scalerAdaptive.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UniqueLetter {

    public static void main(String[] args) {
        UniqueLetter obj = new UniqueLetter();
        String s = "jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl";
        String result = obj.solve(s);
        System.out.println(result); // Expected output: "ltcde"
    }

    public String solve(String s) {
        StringBuilder result = new StringBuilder();

        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);

            queue.offer(c);

            while(!queue.isEmpty()&& map.get(queue.peek()) > 1) {
                queue.poll(); // Remove characters that are not unique
            }
            if(!queue.isEmpty()) {
                result.append(queue.peek()); // Append the first unique character
            } else {
                result.append('#'); // Append '#' if no unique character is found
            }


        }
        return result.toString();
    }
}
