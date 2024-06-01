package com.practices.java8;

import java.util.function.Predicate;

public class PredicateExample2 {
public static void main(String[] args) {
	String names[]= {"mano","naveen","chandar","manonmani","naveen chandar"};
	
	Predicate<String> p=nam->nam.length()>5;
	for(String name:names)
	{
		if(p.test(name)) {
			System.out.println(name);
		}
	}
	
}
}
