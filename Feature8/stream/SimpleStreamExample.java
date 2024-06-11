package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Predicate<Person> salary=pe->pe.getSalary()>=2000;
        Predicate<Person> sal2=pes->pes.getSalary()<=20000;
        Stream<Integer> st=Stream.of(0,2,1,3,4,5,6);
       st.forEach(System.out::println);
       Integer n1[]=new Integer[]{1,2,3,4,45};
       Stream<Integer> s2=Stream.of(n1);
       s2.forEach(System.out::println);
       Map<String, Integer> map= FunctionWithPerson.getAllPersonList().stream().filter(per->per.getSalary()>2000)
               .filter(sal2).filter(salary).collect(Collectors.toMap(Person::getName,Person::getSalary));
        System.out.println(map);
    }
}

