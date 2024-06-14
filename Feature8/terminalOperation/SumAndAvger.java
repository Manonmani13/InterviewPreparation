package com.terminalOperation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAvger {
    public static void main(String[] args) {
        List<Integer> intlint= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int total=intlint.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(total);
        double average=intlint.stream().collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(average);
    }
}
