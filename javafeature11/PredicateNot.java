package com.practices.javafeature11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNot {
    public static void main(String[] args) {
        List<String> change= Arrays.asList("Java","\n","HTML");
        List<String> tutorial=change.stream().filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        tutorial.forEach(System.out::println);
    }
}
