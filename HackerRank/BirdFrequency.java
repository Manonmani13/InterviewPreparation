package com.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BirdFrequency {
	public static void main(String[] args) {
		int  n[]= {1 ,2, 3 ,4, 5, 4, 3, 2, 1, 3, 4};
		Map<Integer, Long> map=Arrays.stream(n)
				.boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Optional<Map.Entry<Integer, Long>> mostFrequent = map.entrySet().stream()
                .sorted((e1, e2) -> {
                    int frequencyComparison = e2.getValue().compareTo(e1.getValue()); // Descending frequency
                    if (frequencyComparison == 0) {
                        return e1.getKey().compareTo(e2.getKey()); // Ascending type number
                    }
                    return frequencyComparison;
                })
                .findFirst();
		System.out.println(mostFrequent.map(Map.Entry::getKey).orElse(0));
		}

}
