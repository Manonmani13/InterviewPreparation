package com.proretention.scrm.Integration.filter;

import java.util.Collections;
import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria)
    {
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }

    @Override
    public List<Person> meetCritiera(List<Person> personList) {
        List<Person> newlist=criteria.meetCritiera(personList);
        return otherCriteria.meetCritiera(newlist);
    }
}
