package com.proretention.scrm.Integration.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;

    private String dept;

    private int salary;

    private List<Employee> subdirect;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subdirect = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubdirect() {
        return subdirect;
    }

    public void setSubdirect(List<Employee> subdirect) {
        this.subdirect = subdirect;
    }
    public  void add(Employee e) {
        subdirect.add(e);
    }

    public void remove(Employee e) {
        subdirect.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subdirect;
    }
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
