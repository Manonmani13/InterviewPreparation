package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchExample {
    public static void main(String[] args) {
        List<String> furits = Arrays.asList("Apple","Orange","Mango","Graphs","PineApple");
        Predicate<String> p=s->s.length()>3;
        Predicate<String> p2=s->s.equalsIgnoreCase("Apple");
        System.out.println(furits.stream().allMatch(p));
        System.out.println(furits.stream().allMatch(p2));
        System.out.println(furits.stream().anyMatch(p2));
        Predicate<Person> personPredicate=per->per.getSalary()>2000;
        boolean allmatch= FunctionWithPerson.getAllPersonList().stream()
                .allMatch(personPredicate);
        System.out.println("Person match"+allmatch);
        boolean anymatch= FunctionWithPerson.getAllPersonList().stream()
                .anyMatch(personPredicate);
        System.out.println("Person match"+anymatch);

    }
}

