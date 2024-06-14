package com.terminalOperation;

import com.function.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingExample {
    public static List<Person> getAllPersonList()
    {
        Person p=new Person("Manonmani",2000,"India");
        Person p2=new Person("Naveen",200000,"India");
        Person p3=new Person("Pandukumar",20000,"Madurai");

        List<Person> ls=new ArrayList<>();
        ls.add(p);
        ls.add(p2);
        ls.add(p3);
        return ls;
    }
    static void groupByCountry()
    {
        Map<String,List<Person>> group=getAllPersonList().stream()
                .collect(Collectors.groupingBy(Person::getConuntry));
        Stream.of(group).forEach(System.out::println);
    }

    public static void main(String[] args) {
        groupByCountry();
        twoLevelGrouping();
    }
    static void twoLevelGrouping()
    {
        Map<String,Map<String,List<Person>>> groupData=getAllPersonList().stream()
                .collect(Collectors.groupingBy(Person::getConuntry,
                        Collectors.groupingBy(per->per.getSalary()>2000?"Highest":"Low")));
        Stream.of(groupData).forEach(System.out::println);
    }


}

