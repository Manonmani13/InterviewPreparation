package com.predicate;

import java.util.function.Predicate;

public class BiPredicate {
public static void main(String[] args) {
	Predicate<Integer> p=a->a>20;
	Predicate<Integer> p2=a->a<20;
	java.util.function.BiPredicate<Integer,Integer> bp=(a,b)->a>=50 && b<50;
	boolean b=bp.test(60, 30);
	System.out.println(b);
	
}
}
