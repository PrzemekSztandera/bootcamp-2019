package com.manchesterdigital;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int result = 0;
        for(Integer integer : numbers) {
            result += integer * 2;
        }

        System.out.println("result = " + result);

        numbers.stream().mapToInt(integer -> integer * 2).sum();
        var sum = IntStream.rangeClosed(0, 10).sum();
        System.out.println("sum = " + sum);

        var names = List.of("john", "amy", "jack");

        var listOfUpperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("listOfUpperCaseNames = " + listOfUpperCaseNames);

        // dealing with multiple streams
        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos", "Rich Man"),
                List.of("Bill Gates", "Another Rich Man"),
                List.of("Deborah Meadon", "Rich Women"),
                List.of("Mark Zuckerberg")
        );

        var flattedReachPeople = richPeople
                .stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("flattedReachPeople = " + flattedReachPeople);
    }
}
