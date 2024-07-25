package com.proretention.scrm.Integration.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock=new Stock();
        BuyStock buyStock=new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStockOrder);

        broker.orderPlace();
    }
}
