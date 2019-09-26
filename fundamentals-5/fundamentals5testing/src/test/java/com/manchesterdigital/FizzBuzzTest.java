package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void whenIntegerIsMultipleOf3ShouldReturnFizz() {
        // arrange
        int num = 3;
        // act
        String word =  FizzBuzz.checkFizzBuzz(3);
        // assert
        assertThat(word).isEqualTo("Fizz");
    }

    @Test
    public void whenIntegerIsMultipleOf5ShouldReturnBuzz() {
        // arrange
        int num = 5;
        // act
        String word =  FizzBuzz.checkFizzBuzz(num);
        // assert
        assertThat(word).isEqualTo("Buzz");
    }

    @Test
    public void whenIntegerIsMultipleOf3And5ShouldReturnFizzBuzz() {
        // arrange
        int num = 15;
        // act
        String word =  FizzBuzz.checkFizzBuzz(num);
        // assert
        assertThat(word).isEqualTo("FizzBuzz");
    }

    @Test
    public void whenIntegerIsNotMultipleOf3Or5ShouldReturnNumberAsString() {
        // arrange
        int num = 2;
        // act
        String word =  FizzBuzz.checkFizzBuzz(num);
        // assert
        assertThat(word).isEqualTo("2");
    }
}
