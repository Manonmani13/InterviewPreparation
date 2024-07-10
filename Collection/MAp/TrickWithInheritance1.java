package com.practices.collections;

public class TrickWithInheritance1 {
    public static void main(String[] args) {
        Parent p=new Child();
        p.print();
    }

}
class Parent{
    public void print(){
        System.out.println("Say hi");
    }
}
class Child extends Parent{
    @Override
    public void print() {
        System.out.println("Say hello");
    }
}
