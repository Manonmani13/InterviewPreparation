package com.suppilier;

import com.function.FunctionWithPerson;
import com.function.Person;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<Person>> ls=()-> FunctionWithPerson.getAllPersonList();
        System.out.println(ls.get());
        Supplier<Double> io=()->Math.random();
        System.out.println(io.get());
    }
}
