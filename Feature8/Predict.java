package com.practices.java8;

import java.util.function.Predicate;

public class Predict {


	public static void main(String[] args) {
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(20));

        EmployeeWithCompartor emp = new EmployeeWithCompartor("mano", 1); 
        Predicate<EmployeeWithCompartor> p1 = e -> e.eno >=1; 
        System.out.println(p1.test(emp));
    }
}
