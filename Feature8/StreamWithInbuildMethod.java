package com.practices.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamWithInbuildMethod {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("bcdd");
	l.add("abc");
	l.add("cjdd");
//	l.stream().sorted((ele1,ele2)->-123).forEach(System.out::println);
//	l.stream().sorted((ele1,ele2)->123).forEach(System.out::println);
	l.stream().sorted((ele1,ele2)->ele2.compareTo(ele1)).forEach(System.out::println);

}
}
