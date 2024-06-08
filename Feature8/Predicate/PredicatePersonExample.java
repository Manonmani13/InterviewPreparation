package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonExample {

public static  List<Person> getAllPersons()
{
	Person p=new Person("Mano", 12, 2000, "Female");
	Person p1=new Person("Manonamani", 13, 20000, "Female");
	Person p2=new Person("Naveen", 14, 2500, "Female");
	Person p3=new Person("Chandar", 15, 23000, "Female");
	List<Person> ls=new ArrayList();
	ls.add(p);
	ls.add(p1);ls.add(p2);
	ls.add(p3);
	return ls;
}
static Predicate<Person> person=per->per.getSalary()>1000;
static Predicate<Person> person2=per->per.getId()>12;


public static void main(String[] args) {
	List<Person> pl=getAllPersons();
	pl.forEach(per->{
		if(person.and(person2).test(per))
			System.out.println(per.getName());
	});
	
	
}
}
