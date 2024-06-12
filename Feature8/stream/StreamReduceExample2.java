package com.stream;

import com.function.FunctionWithPerson;
import com.function.Person;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        combineName();
    }
    static void combineName()
    {
        String names= FunctionWithPerson.getAllPersonList().stream()
                .map(Person::getName)
                .reduce("",(a,b)->a.concat(b));
        System.out.println(names);
    }

}
