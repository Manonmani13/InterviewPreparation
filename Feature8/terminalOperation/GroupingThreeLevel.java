package com.terminalOperation;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingThreeLevel {
    static  void threeLevelGrouping()
    {
        Map<String, List< Person>>  group= FunctionWithPerson.getAllPersonList()
                .stream().collect(Collectors.groupingBy(Person::getName,HashMap::new ,Collectors.toList()));
        Stream.of(group).forEach(System.out::println);
    }

    public static void main(String[] args) {
        threeLevelGrouping();
    }

}
