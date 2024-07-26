package com.proretention.scrm.Integration.memento;

public class Originator {

    String state;

    public void setState(String state)
    {
        this.state=state;
    }
    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
