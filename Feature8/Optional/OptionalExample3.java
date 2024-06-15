package com.Optional;

import com.function.Person;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        OrElse();
        orElseGet();
        OrElseThrow();
    }
    static void OrElse()
    {
        Optional<Person> pers=getPersonOptional();
        String name=pers.map(Person::getName).orElse("No Record Found");
        Optional<Person> pers2=Optional.of(new Person(null,0,null));
        System.out.println(pers2);

        System.out.println(name);


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
    static void OrElseThrow()
    {
        Optional<Person> pers=getPersonOptional();
        String name=pers.map(Person::getName).orElseThrow(()->
            new RuntimeException( "No Record Found")
        );
        System.out.println("Throw "+name);
    }



}

