package com.numbericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxing {
    public static void main(String[] args) {
        boxingMethod().forEach(System.out::println);
        List<Integer> ls= Arrays.asList(1,2,3,4,5);
        int sum=calculateSum(ls);
        System.out.println(sum);

    }
    public static List<Integer> boxingMethod()
    {
        return  IntStream.rangeClosed(0,100).boxed().collect(Collectors.toList());
    }
    static int calculateSum(List<Integer> ls)
    {
        return ls.stream().mapToInt(Integer::intValue)
                .sum();
    }

}
