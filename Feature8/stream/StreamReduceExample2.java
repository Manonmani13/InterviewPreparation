package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        combineName();
        getSalary();
    }
    static void combineName()
    {
        String names= FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .reduce("",(a,b)->a.concat(b));
        System.out.println(names);
    }
    static void  getSalary()
    {
        Optional<Person> salary=FunctionWithPerson.getAllPersonList().stream()
                .reduce((x,y)->x.getSalary()>y.getSalary()?x:y);
        System.out.println(salary);
    }


}

