package com.manchesterdigital.challenge;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberChallenge {

    private static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map( n -> n % 10 ).collect(Collectors.toList());
    }

    private static List<Integer> square(List<Integer> nums) {
        return nums.stream().map( n -> n * n ).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 33, 45, 6, 989);

        System.out.println("rightDigit(numbers) = " + rightDigit(numbers));
        System.out.println("square(numbers) = " + square(numbers));
    }
}
