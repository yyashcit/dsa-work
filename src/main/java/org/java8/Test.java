package org.java8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {


    public static void main(String[] args) {
        //create an list of strings
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Bob"};
        List<String> namesList = List.of(names);


        //Count occurrence of a given character in a string using Stream API in Java.
        long count = namesList.stream().filter(name -> name.contains("a")).count();
        System.out.println("Count of names containing 'a': " + count);

        //How to get Slice of a Stream in Java?
        List<String> slicedNames = namesList.stream().skip(1).limit(3).toList();
        System.out.println("Sliced Names: " + slicedNames);

        //How to Reverse elements of a Parallel Stream in Java?


// Iterate over a Stream with Indices
        String[] array = {"G", "E", "E", "k"};
        IntStream.range(0, array.length)
                // Map each index to its corresponding string representation
                .mapToObj(index -> String.format("%d -> %s", index, array[index]))
                // print each and every element of the stream
                .forEach(System.out::println);

        //find odd even numbers in a list
        List<Integer> numbers = List.of(1, 2, 3, 4, 6, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenList);
        List<Integer> oddList = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddList);


        //each character frequency in a string
        String name = "rohitroh";
        Map<String, Long> characterFrequency = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println("Character Frequency: " + characterFrequency);

//Create a list of decimal number
        List<Double> decimalNumbers = Arrays.asList(4.5, 2.3, 1.7, 3.1, 1.9);
        List<Double> dlist = decimalNumbers.stream().sorted((d1, d2) -> d2.compareTo(d1)).collect(Collectors.toList());
        System.out.println("Sorted Decimal Numbers: " + dlist);

        //word frequency in a list of strings
        Map<String, Long> collect = namesList.stream().collect(groupingBy(Function.identity(), counting()));


        //max value from a list of decimal numbers
        int max = decimalNumbers.stream().max(Double::compare).get().intValue();
        System.out.println("max value " + max);

        //min value from a list of decimal numbers
        int min = decimalNumbers.stream().min(Double::compare).get().intValue();
        System.out.println("max value " + min);

        //merge two arrays and sort
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};

        int[] sortedArrayByMergingTwoArray = IntStream.concat(Arrays.stream(randomNumbers),
                Arrays.stream(randomNumber2)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));

//Find the sum of all digits of a number in Java 8
        int number = 12345;
        int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println("Sum of digits: " + sum);


        namesList.stream().sorted((s1,s2)-> s1.length()).forEach(System.out::println);
    }
}
