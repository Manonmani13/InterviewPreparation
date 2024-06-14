package com.numbericStream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinMEthodExample {
    public static void main(String[] args) {
        char[] c={'a','b','c','d','e'};
        String newString= Stream.of(c).map(s->new String(s)).collect(Collectors.joining());
        System.out.println(newString);

    }
}
