package com.sequenicalParallel;

import java.util.stream.IntStream;

public class ParallelNotUseExample2 {
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        IntStream.rangeClosed(1,20).forEach(cal::calculate);
        System.out.println(cal.getTotal());
        IntStream.rangeClosed(1,20).parallel().forEach(cal::calculate);
        System.out.println(cal.getTotal());


    }
}
