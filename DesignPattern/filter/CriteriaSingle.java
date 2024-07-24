package com.proretention.scrm.Integration.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCritiera(List<Person> personList) {
        List<Person> newlist=new ArrayList<>();
        for(Person pers:personList)
        {
            if(pers.getMartialStatus().equalsIgnoreCase("Single"))
            {
                newlist.add(pers);
            }
        }
        return newlist;
    }
}
