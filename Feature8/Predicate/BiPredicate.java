package com.predicate;

import java.util.List;
import java.util.function.Predicate;

public class BiPredicate {
public static void main(String[] args) {
	Predicate<Integer> p=a->a>20;
	Predicate<Integer> p2=a->a<20;
	java.util.function.BiPredicate<Integer,Integer> bp=(a,b)->a>=50 && b<50;
	boolean b=bp.test(60, 30);
	System.out.println(b);
	List<Person> pl=PredicatePersonExample.getAllPersons();

	java.util.function.BiPredicate<Integer,String> ls=(salary,name)->salary>1000 && name.contains("ano");
	pl.forEach(per->{
		if(ls.test(per.getSalary(), per.getName()))
			System.out.println(per);

	}
					
			);
	
}
}
