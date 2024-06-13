package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Optional;
import java.util.function.Predicate;

public class FindAnyExample {
    public static void main(String[] args) {
        Predicate<Person> pred=per->per.getSalary()>2000;
        Optional<Person> person= FunctionWithPerson.getAllPersonList().stream()
                .filter(pred)
                .findAny();
        System.out.println(person);
        Optional<Person> persons= FunctionWithPerson.getAllPersonList().stream()
                .filter(pred)
                .findFirst();
        System.out.println(persons);
    }
}
