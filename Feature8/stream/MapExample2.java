package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample2 {
    static Function<Person,String> fun= per->per.getName();
    static Function<String,String> upper=pers->pers.toLowerCase();
    public static void main(String[] args) {
        List<Person> personList= FunctionWithPerson.getAllPersonList();
        System.out.println(getPersonNames(personList));
        personList.stream().map(fun).map(upper).collect(Collectors.toList()).forEach(System.out::println);
    }
    static List<String> getPersonNames(List<Person> person)
    {
        return person.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.toList());
    }

}

