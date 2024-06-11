package com.stream;

import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Stream<Integer> st=Stream.of(0,2,1,3,4,5,6);
       st.forEach(System.out::println);
       Integer n1[]=new Integer[]{1,2,3,4,45};
       Stream<Integer> s2=Stream.of(n1);
       s2.forEach(System.out::println);
    }
}
