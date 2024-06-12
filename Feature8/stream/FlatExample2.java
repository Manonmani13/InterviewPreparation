package com.stream;

import com.function.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatExample2 {


    public static void main(String[] args) {
        List<Integer> odd= Arrays.asList(1,3,5,7,9);
        List<Integer> even=Arrays.asList(2,4,6,8,10,10);
        List<List<Integer>> listOfList=Arrays.asList(odd,even);
        List<Integer> map=listOfList.stream().flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
        Long ex=listOfList.stream().flatMap(List::stream).sorted().distinct().count();

        System.out.println(map);
        System.out.println(ex);

    }

}
