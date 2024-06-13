package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<String> furits= Arrays.asList("Apple","Orange","Mango","PineApple");
        furits.stream().limit(3).forEach(System.out::println);

    }
}
