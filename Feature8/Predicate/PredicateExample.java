package com.predicate;

import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
	Predicate<Integer> p=a->a>20;
	Predicate<Integer> p2=a->a<20;
	Predicate<Integer> p3=a->a==20;
	System.out.println(p.test(20)+" "+p2.test(10)+" "+p3.test(20));
	System.out.println(p.and(p2).test(23));
	System.out.println(p.or(p3).test(20));
	
}
}
