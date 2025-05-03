package org.dsa.scaler.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

    public static void main(String[] args) {
Integer [] A={1,2,2,1};
Integer [] B={2,3,1,2};
        System.out.println(solve(new ArrayList<>(Arrays.asList(A)),new ArrayList<>(Arrays.asList(B))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        Map<Integer, Integer> hmA = new HashMap<>();
        Map<Integer, Integer> hmB = new HashMap<>();
        for (Integer i : A) {
            hmA.put(i, hmA.getOrDefault(i, 0) + 1);
        }
        for (Integer i : B) {
            hmB.put(i, hmB.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList();
        for (int Akey : hmA.keySet()) {

            if (hmB.containsKey(Akey)) {
                int freqAKeyinA = hmA.get(Akey);
                int freqAKeyinB = hmB.get(Akey);
                if (freqAKeyinA == freqAKeyinB) {
                    for (int i = 0; i < freqAKeyinA; i++)
                        al.add(Akey);

                } else if (freqAKeyinA != freqAKeyinB) {
                    int min = freqAKeyinA < freqAKeyinB ? freqAKeyinA : freqAKeyinB;
                    for (int i = 0; i < min; i++)
                        al.add(Akey);

                }
            }
        }
        return al;
    }
}
