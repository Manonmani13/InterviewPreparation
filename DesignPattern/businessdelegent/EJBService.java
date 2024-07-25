package com.proretention.scrm.Integration.businessdelegent;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");

    }
}
