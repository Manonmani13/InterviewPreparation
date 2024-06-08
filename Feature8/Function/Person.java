package com.function;

public class Person {
    String name;

    int salary;

    String conuntry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getConuntry() {
        return conuntry;
    }

    public void setConuntry(String conuntry) {
        this.conuntry = conuntry;
    }

    public Person(String name, int salary, String conuntry) {
        this.name = name;
        this.salary = salary;
        this.conuntry = conuntry;
    }
}
