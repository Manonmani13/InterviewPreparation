package com.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Orange","Mango","PineApple");
        List<Integer> intList=fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(intList);
    }
}
