package com.proretention.scrm.Integration.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator org=new Originator();
        CareTaker ct=new CareTaker();
        org.setState("State #1");
        ct.add(org.saveStateToMemento());
        org.getStateFromMemento(ct.get(0));
        ct.add(org.saveStateToMemento());

        org.setState("State #3");
        ct.add(org.saveStateToMemento());

        org.setState("State #4");
        System.out.println("Current State: " + org.getState());

        org.getStateFromMemento(ct.get(0));
        System.out.println("First saved State: " + org.getState());
        org.getStateFromMemento(ct.get(1));
        System.out.println("Second saved State: " + org.getState());
    }
}
