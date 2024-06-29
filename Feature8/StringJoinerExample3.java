package com.proretention.scrm.calendar;

import java.util.StringJoiner;

public class StringJoinerExample3 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","{","}");
        sj.add("Mano");
        sj.add("Manonmani");
        StringJoiner sj2=new StringJoiner(",","{","}");
        sj.add("Kumar");
        sj.add("Manonmani");
        System.out.println(sj2);
        StringJoiner sjo=sj.merge(sj2);
        System.out.println(sjo);
    }
}
