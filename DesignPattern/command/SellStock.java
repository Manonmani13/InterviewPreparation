package com.proretention.scrm.Integration.command;

public class SellStock implements Order{
    private Stock add;
    public SellStock(Stock add)
    {
        this.add=add;
    }
    @Override
    public void execute() {
        add.sell();
    }
}
