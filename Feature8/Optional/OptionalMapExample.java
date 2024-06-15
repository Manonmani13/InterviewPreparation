package com.Optional;

import com.function.Person;

import java.util.Optional;

public class OptionalMapExample {
    public static void main(String[] args) {
        Optional<String> ofNull= Optional.ofNullable("java8");
        System.out.println(ofNull.isPresent()?ofNull:ofNull.isEmpty());
        ofNull.ifPresent(System.out::println);
        OptionalMapExample();
    }
    static void OptionalMapExample(){
        Optional<Person> pers=getPersonOptional();
        pers.ifPresent(per->{String name= pers.map(Person::getName).orElse("No Record Found");
            System.out.println("name "+name);}
        );

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
}
