package com.practices.java8;

import java.util.function.Function;

public class ApplyMethod2 {
public static void main(String[] args) {
	Function<String, Integer> l=s->s.length();
	System.out.println(l.apply("manonmanipandukumar"));
}
}
