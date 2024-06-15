package com.Optional;

import com.function.Person;

import java.util.Optional;

public class OptionalExample {
    static String myName(String name)
    {
        return name;
    }
    static String personName(Person per)
    {
        if(null!=per)
        {
            return per.getName();
        }
        else{
            return "No Record Found";
        }
    }

    public static void main(String[] args) {
        Optional<String> name=Optional.ofNullable(myName("Naveeen"));
        System.out.println(name.get());
        Optional<String> name1=Optional.ofNullable(null);
//        System.out.println(name1.get());
        System.out.println(name1.isPresent()?name1.get():"No data");
        System.out.println(personName(new Person("Naveen",100000,"India")));
    }
    static Optional<String> personNameOptional(Optional<Person> per)
    {
        if(per.isPresent())
            return Optional.of(per.get().getName());
        else
            return Optional.empty();
    }


}

