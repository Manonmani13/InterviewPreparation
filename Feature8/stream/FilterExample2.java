package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample2 {
    public static void main(String[] args) {
        Predicate<Person> person=per->per.getSalary()>2000;
        Predicate<Person> persons=per->per.getConuntry().equalsIgnoreCase("India");
        FunctionWithPerson.getAllPersonList().stream().filter(persons.and(person)).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
