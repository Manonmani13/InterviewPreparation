package com.consumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConusumerPersonEample {
	static List<Person> person=ConsumeExampleWithPerson.getAllPersons();
	static BiConsumer<String, Integer> con=(name,salary)->System.out.println("Name "+name + " Salary "+salary);
public static void main(String[] args) {
	person.forEach(p->con.accept(p.getName(),p.getSalary()));
}
}
