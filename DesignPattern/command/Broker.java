package com.proretention.scrm.Integration.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList=new ArrayList<>();
    public void takeOrder(Order order)
    {
        orderList.add(order);
    }

    public void orderPlace()
    {
        for(Order order:orderList)
        {
            order.execute();
        }
        orderList.clear();
    }
}
