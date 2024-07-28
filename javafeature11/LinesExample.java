package com.practices.javafeature11;

import java.util.stream.Stream;

public class LinesExample {
    public static void main(String[] args) {
        String example="This is first line \n.This is second line \n.This is third line";
        Stream<String> line=example.lines();
       line.forEach(System.out::println);
    }
}
