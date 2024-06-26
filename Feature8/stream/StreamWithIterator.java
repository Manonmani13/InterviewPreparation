package com.stream;

import java.util.stream.Stream;

public class StreamWithIterator {
    public static void main(String[] args) {
        Stream.iterate(1,element->element+1).filter(ele->ele%2==0)
                .limit(10).forEach(System.out::println);
    }
}
