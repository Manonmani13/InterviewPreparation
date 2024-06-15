package com.Optional;

import com.function.Person;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        OrElse();
    }
    static void OrElse()
    {
        Optional<Person> pers=getPersonOptional();
        String name=pers.map(Person::getName).orElse("No Record Found");
        Optional<Person> pers2=Optional.of(new Person(null,0,null));
        System.out.println(pers2);

        System.out.println(name);

        orElseGet();

    }
    public static Optional<Person> getPersonOptional()
    {
        Person per=getPerson();
        return Optional.of(per);
    }
    static Person getPerson()
    {
        return new Person("Naveen",100000,"India");
    }
    static void orElseGet()
    {
        Optional<Person> pers=getPersonOptional();
        String name=pers.map(Person::getName).orElseGet(()->{
            return "No Record Found";
        });
        System.out.println(name);
    }


}
