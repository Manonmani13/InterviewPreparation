package com.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> odd= Arrays.asList(1,3,5,7,9);
        List<Integer> even=Arrays.asList(2,4,6,8,10);
        List<List<Integer>> listOfList=Arrays.asList(odd,even);
        System.out.println(listOfList);
        List<Integer> flatMap=listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatMap);
    }
}
