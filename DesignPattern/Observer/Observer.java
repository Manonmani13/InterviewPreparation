package com.proretention.scrm.Integration.Observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}