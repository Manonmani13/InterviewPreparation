package com.practices.java8;

import java.util.function.Predicate;

public class PreadicateExample3 {
public static void main(String[] args) {
	int n[]= {2,3,5,10,20,40,55};
	Predicate<Integer> p1=no->no%2==0;
	Predicate<Integer> p2=no2->no2>10;
	for(int x1:n) {
		if(p1.and(p2).test(x1))
		{
			System.out.println(x1);
		}
	}
	for(int x1:n) {
		if(p1.or(p2).test(x1))
		{
			System.out.println(x1);
		}
	}
	
}
}
