package com.practices.javapractices;

public class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode()
    {
        return this.age;
    }
    @Override
    public boolean equals(Object obj)
    {
        Person p=(Person) obj;
        return this.name.equals(p.name)&& this.age==p.age;

    }
    @Override
    public String toString()
    {
        return this.name +" "+this.age;
    }



}
