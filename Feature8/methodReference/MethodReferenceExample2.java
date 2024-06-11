package com.methodReference;

import com.function.Person;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    static  Predicate<Person> p1=MethodReferenceExample2::salary;


    static BiPredicate<Person,Integer> p2=MethodReferenceExample2::salaryCheckWithParam;

    public static void main(String[] args) {

        System.out.println("Predicate Hight "+p1.test(getPerson()));
        System.out.println("Predicate Hight "+p2.test(getPerson(),1000));
        MethodReferenceExample2 re=new MethodReferenceExample2();
        Function<String,String> f1=re :: sayMyName;
        System.out.println(f1.apply("Manonmani"));


    }
    static boolean salary(Person per)
    {
        return per.getSalary()>1000;
    }
    static boolean salaryCheckWithParam(Person per,Integer salary)
    {
        return per.getSalary()>salary;
    }
     String sayMyName(String name)
    {
        return "Hello "+name;
    }
    static Person getPerson()
    {
        return new Person("Mano",2000,"India");
    }



}
