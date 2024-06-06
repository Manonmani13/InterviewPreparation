package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeExampleWithPerson {
	static Consumer<Person> c1=per->System.out.println(per);
	static Consumer<Person> c2=per->System.out.println(per.getName().toUpperCase());
public static void main(String[] args) {
	List<Person> person=getAllPersons();
	person.forEach(c1);
	person.forEach(c1.andThen(c2));
	
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
}
