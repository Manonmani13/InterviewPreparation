package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinExample {
    public static void main(String[] args) {
        Optional<Person> list= FunctionWithPerson.getAllPersonList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getSalary)));
        System.out.println(list);
        Optional<Person> list2= FunctionWithPerson.getAllPersonList().stream()
                .collect(Collectors.minBy(Comparator.comparing(Person::getSalary)));
        System.out.println(list2);
        Person saal=FunctionWithPerson.getAllPersonList().get(0);
        List<Person> pers=FunctionWithPerson.getAllPersonList().stream()
                .filter(p->p.getSalary()== saal.getSalary())
                .collect(Collectors.toList());
        System.out.println(pers);
    }

}
