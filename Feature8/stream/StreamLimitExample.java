package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<String> furits= Arrays.asList("Apple","Orange","Mango","PineApple");
        furits.stream().limit(3).forEach(System.out::println);
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum=list.stream().limit(3).reduce(0,(x,y)->x+y);
        System.out.println(sum);

    }
}

