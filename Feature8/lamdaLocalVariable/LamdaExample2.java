package com.feature8.lamda;

interface Addable{
    int addition(int a,int b);
}
class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}
public class LamdaExample2 {
    public static void main(String[] args) {
        Addable addition=(int a,int b)->(a+b);
        int add=addition.addition(10,30);
        System.out.println(add);

    }
}
