package com.proretention.scrm.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",");
        sj.add("Mano");
        sj.add("Manonmani");
        System.out.println(sj);
    }
}
