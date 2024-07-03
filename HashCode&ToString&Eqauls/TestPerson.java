package com.practices.javapractices;

public class TestPerson {
    public static void main(String[] args) {
        Person p1=new Person("A",20);
        Person p2=new Person("A",20);

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
