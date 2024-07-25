package com.proretention.scrm.Integration.command;

public class BuyStock implements Order{
    private Stock addStock;
    public BuyStock(Stock addStock)
    {
        this.addStock=addStock;
    }
    @Override
    public void execute() {
        addStock.buy();
    }
}
