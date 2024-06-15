package com.Optional;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> ls= FunctionWithPerson.getAllPersonList()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(ls);
        ls.forEach(System.out::println);
        Collections.sort(ls);
    }
}
