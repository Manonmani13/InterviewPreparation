package com.proretention.scrm.Integration.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
        Criteria male=new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        printPerson(male.meetCritiera(persons));
        printPerson(female.meetCritiera(persons));
        printPerson(singleOrFemale.meetCritiera(persons));

        printPerson(singleMale.meetCritiera(persons));

    }
    public static void printPerson(List<Person> personList)
    {
        for(Person pers:personList)
            System.out.println("Name "+pers.getName()+" Gender "+pers.getGender()+" Marital Status "+pers.getMartialStatus());
    }

}
