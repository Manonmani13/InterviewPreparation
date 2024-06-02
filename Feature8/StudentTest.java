package com.practices.java8;

import java.util.function.Function;

public class StudentTest {
public static void main(String[] args) {
	Function<Student, String> f=s->{
		int  mark=s.mark;
		String grade="";
		if(mark>=80) grade="A [Distinction]";
		else if(mark>=60) grade="B [First Class]";
		else if(mark>=50) grade="C [Second Class]";
		else if(mark>=35) grade="D [Third Class]";
		else grade="E [Failed]";
				return grade;
	};
	Student s[]= {
			new Student("Mano",11),
			new Student("manonmani",12)
	};
	for(Student s1:s)
	{
		System.out.println("Student Name : "+s1.name);
		System.out.println("Student Mark : "+s1.mark);
		System.out.println("Student Grade : "+f.apply(s1));
	}
}
}
