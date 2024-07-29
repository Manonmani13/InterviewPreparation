package com.practices.leedconde;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDay {
    public static void main(String[] args) {
        int date=23,month=05,year=2024;
        LocalDate dates=LocalDate.of(year,month,date);
        String dayOfWeek = dates.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(dayOfWeek.toUpperCase());
    }

}
