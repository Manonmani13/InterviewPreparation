package com.proretention.scrm.Integration.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject obj=SingleObject.getInstance();
        obj.Show();
    }
}
