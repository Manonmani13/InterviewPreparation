package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExamplee {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Mano","Manonmani","Pandukumar","Maha");
        Stream<String> update=names.stream().filter(s->s.length()>4);
        update.forEach(System.out::println);
    }
}
