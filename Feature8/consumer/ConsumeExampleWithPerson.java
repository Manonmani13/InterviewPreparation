package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeExampleWithPerson {
	static Consumer<Person> c1=per->System.out.println(per);
	static Consumer<Person> c2=per->System.out.println(per.getName().toUpperCase());
	static List<Person> person=getAllPersons();

public static void main(String[] args) {
//	person.forEach(c1.andThen(c2));
	printWithCondition();
	
	
}
public static  List<Person> getAllPersons()
{
	Person p=new Person("Mano", 12, 2000, "Female");
	Person p1=new Person("Manonamani", 13, 20000, "Female");
	Person p2=new Person("Naveen", 14, 2500, "Female");
	Person p3=new Person("Chandar", 15, 23000, "Female");
	List<Person> ls=new ArrayList<>();
	ls.add(p);
	ls.add(p1);ls.add(p2);
	ls.add(p3);
	return ls;
}
static void printWithCondition()
{
	person.forEach((per)->{
		if(per.getSalary()>2000)
		{
			System.out.println(per);
		}
	});
}
}
