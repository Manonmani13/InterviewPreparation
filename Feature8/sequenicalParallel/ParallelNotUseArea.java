package com.sequenicalParallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelNotUseArea {
    static int seqCal(List<Integer> list)
    {
        long start=System.currentTimeMillis();
        int total=list.stream().reduce(0,(x,y)->x+y);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return total;

    }
    static int parallelCal(List<Integer> list)
    {
        long start=System.currentTimeMillis();
        int total=list.parallelStream().reduce(0,(x,y)->x+y);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return total;

    }

    public static void main(String[] args) {
        List<Integer> input= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
        seqCal(input);
        parallelCal(input);

    }

}
