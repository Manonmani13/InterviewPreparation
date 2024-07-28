package com.practices.javafeature11;

import java.util.Optional;

public class IsPresentOptional {
    public static void main(String[] args) {
        String name=null;
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(!Optional.ofNullable(name).isEmpty());
        name="manonmani";
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(!Optional.ofNullable(name).isEmpty());
    }

}
