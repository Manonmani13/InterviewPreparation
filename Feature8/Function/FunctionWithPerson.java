package com.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionWithPerson {
    static Predicate<Person> p=per->per.getConuntry().equalsIgnoreCase("Madurai");
    static Predicate<Person> p2=per->per.getSalary()>2000;

    public static void main(String[] args) {
        List<Person> personList=getAllPersonList();
        System.out.println(persons.apply(personList));
    }
    static Function<List<Person>, Map<String,Integer>> persons=(list)->{
        Map<String,Integer> map=new HashMap<>();
        list.forEach(per->{
            if(p.and(p2).test(per))
                map.put(per.getName(),per.getSalary());
        });
        return map;
    };

    static List<Person> getAllPersonList()
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

}
