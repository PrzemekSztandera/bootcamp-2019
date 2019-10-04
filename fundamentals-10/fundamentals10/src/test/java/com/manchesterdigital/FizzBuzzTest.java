package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void whenNumberIsMultipleOf3ShouldPrintFizz() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        // act
        String result = fizzBuzz.printer(number);
        //assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void whenNumberIsNotMultipleOf3ShouldPrintTheNumber() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        // act
        String result = fizzBuzz.printer(number);
        //assert
        assertThat(result).isEqualTo("5");
    }

    @Test
    public void whenNumberContains3ShouldPrintFizz() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 232;
        // act
        String result = fizzBuzz.printer(number);
        //assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void whenNumberIsMultipleOf5ShouldPrintBuzz() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        // act
        String result = fizzBuzz.printer(number);
        //assert
        assertThat(result).isEqualTo("Buzz");
    }
}
