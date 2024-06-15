package com.Optional;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Comparator;
import java.util.List;

public class DefaultCustomSort {
    static Comparator<Person> c1=Comparator.comparing(Person::getName);
    static Comparator<Person> c2=Comparator.comparing(Person::getConuntry);

    public static void main(String[] args) {
        List<Person> per= FunctionWithPerson.getAllPersonList();
        sortByName(per);
        sortByNAmeWithNull(per);
    }
    static void sortByName(List<Person> personList)
    {
        personList.sort(c1.thenComparing(c2));
        personList.forEach(System.out::println);
    }
    static void sortByName1(List<Person> personList)
    {
        personList.sort(c1);
        personList.forEach(System.out::println);
    }
    static void sortByName2(List<Person> personList)
    {
        personList.sort(c2);
        personList.forEach(System.out::println);
    }
    static void sortByNAmeWithNull(List<Person> list)
    {
        Comparator<Person> nullComp=Comparator.nullsFirst(c1);
        list.sort(nullComp);
        list.forEach(System.out::println);
    }

}

