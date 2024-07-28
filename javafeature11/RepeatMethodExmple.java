package com.practices.javafeature11;

import java.util.Scanner;

public class RepeatMethodExmple {
    public static void main(String[] args) {
        String name="manonmani";
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        System.out.println(name.repeat(count));
    }
}
