package com.terminalOperation;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapping {
    static List<String> getNames()
    {
        List<String> ls= FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .collect(Collectors.toList());
                return ls;
    }
    static List<String> usingTerminalOperation()
    {
        List<String> ls= FunctionWithPerson.getAllPersonList().stream().collect(Collectors.mapping( Person::getName,Collectors.toList()));
        return ls;
    }

    public static void main(String[] args) {
        System.out.println(getNames());
        System.out.println(usingTerminalOperation());
        System.out.println(countofPersons());
    }
    static long countofPersons()
    {
        return FunctionWithPerson.getAllPersonList().stream().filter(per->per.getSalary()>2000).collect(Collectors.counting());
    }


}

