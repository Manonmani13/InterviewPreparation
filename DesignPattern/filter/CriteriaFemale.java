package com.proretention.scrm.Integration.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCritiera(List<Person> personList) {
        List<Person> newlist=new ArrayList<>();
        for(Person pers:personList)
        {
            if(pers.getGender().equalsIgnoreCase("FEMALE"))
            {
                newlist.add(pers);
            }
        }
        return newlist;
    }
}
