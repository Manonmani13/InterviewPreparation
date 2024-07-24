package com.proretention.scrm.Integration.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCritiera(List<Person> personList) {
        List<Person> newlist=new ArrayList<>();
        for(Person pers:personList)
        {
            if(pers.getGender().equalsIgnoreCase("MALE"))
            {
                newlist.add(pers);
            }
        }
        return newlist;
    }
}
