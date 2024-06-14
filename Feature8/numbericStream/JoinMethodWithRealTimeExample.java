package com.numbericStream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.stream.Collectors;

public class JoinMethodWithRealTimeExample {
    public static void main(String[] args) {
        System.out.println(getNames());
        System.out.println(getNamesWithSingleParam());
        System.out.println(getNamesWith3Param());

    }
    static String getNames()
    {
        return FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .collect(Collectors.joining());
    }
    static String getNamesWithSingleParam()
    {
        return FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .collect(Collectors.joining("-"));
    }
    static String getNamesWith3Param()
    {
        return FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .collect(Collectors.joining("-","[","]"));
    }
}
