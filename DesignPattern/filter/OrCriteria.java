package com.proretention.scrm.Integration.filter;

import java.util.Collections;
import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria otherCriteria)
    {
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }
    @Override
    public List<Person> meetCritiera(List<Person> personList) {
        List<Person> firstCriteria  =criteria.meetCritiera(personList);
        List<Person> otherCriteria  =criteria.meetCritiera(personList);
        for(Person pers:otherCriteria)
        {
            if(!firstCriteria.contains(pers))
            {
                firstCriteria.add(pers);
            }
        }
        return firstCriteria;
    }
}
