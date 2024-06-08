package com.function;

import java.util.function.Function;

public class FunctionExample {
public static void main(String[] args) {
	Function<String, Integer> f1=s->s.length();
	Function<String, String> f2=s->s.toUpperCase();
	Function<String, String> f3=s->s.concat("Manonmani ");
	System.out.println(f1.apply("Manonmani" ));
	System.out.println(f2.apply("Manonmani Pandukumar"));
	System.out.println(f3.apply("Pandukumar"));
	System.out.println(f2.andThen(f3).apply("Chandar"));
}
}
