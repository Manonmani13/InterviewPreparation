package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {
    public static void main(String[] args) {
        List<Person> personList= FunctionWithPerson.getAllPersonList();
        System.out.println(getPersonNames(personList));
    }
    static List<String> getPersonNames(List<Person> person)
    {
        return person.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.toList());
    }

}
