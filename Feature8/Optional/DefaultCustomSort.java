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
    }
    static void sortByName(List<Person> personList)
    {
        personList.sort(c1.thenComparing(c2));
        personList.forEach(System.out::println);
    }
}
