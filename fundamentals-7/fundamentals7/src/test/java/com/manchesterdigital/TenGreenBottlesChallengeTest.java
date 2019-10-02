package com.manchesterdigital;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TenGreenBottlesChallengeTest {
    private List<String> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = Arrays.asList("One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine", "Ten");
    }

    @Test
    public void printNumberShouldReturnStringRepresentationOfGivenNumberBetween1And10() {
        // arrange
        List<String> nums = new ArrayList<>();
        // act
        for (int i = 1; i <= 10; i++) {
            nums.add(TenGreenBottlesChallenge.printNumber(i));
        }
        assertThat(numbers).isEqualTo(nums);
    }



}
