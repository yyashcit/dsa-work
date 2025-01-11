package org.dsa.scaler.bitManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("Yogesh");
        nameList.add("Nitesh");
        nameList.add("Rahul");
        nameList.add("Golu");
        nameList.add("monu");

        //stream
List filtedList=        nameList.stream().filter(name->name.length()==4).collect(Collectors.toList());
        System.out.println(filtedList);
    }
}
