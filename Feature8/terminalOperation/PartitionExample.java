package com.terminalOperation;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitionExample {
    public static void main(String[] args) {
        Map<Boolean, List<Person>> part= FunctionWithPerson.getAllPersonList()
                .stream()
                .collect(Collectors.partitioningBy(per->per.getSalary()>2000));
        System.out.println(part);
        Map<Boolean, Set<Person>> part2= FunctionWithPerson.getAllPersonList()
                .stream()
                .collect(Collectors.partitioningBy(per->per.getSalary()>2000,Collectors.toSet()));
        System.out.println(part2);
        Map<Boolean,Map<String,String>> map=FunctionWithPerson.getAllPersonList()
                .stream()
                .collect(Collectors.partitioningBy(per->per.getSalary()>2000,Collectors.toMap(Person::getName,
                        Person::getConuntry)));
        System.out.println(map);
    }
}
