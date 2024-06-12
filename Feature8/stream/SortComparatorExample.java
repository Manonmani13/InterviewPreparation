package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Comparator;

public class SortComparatorExample {
    public static void main(String[] args) {
        FunctionWithPerson.getAllPersonList().stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
        FunctionWithPerson.getAllPersonList().stream().sorted(Comparator.comparing(Person::getSalary)).forEach(System.out::println);

    }
}
