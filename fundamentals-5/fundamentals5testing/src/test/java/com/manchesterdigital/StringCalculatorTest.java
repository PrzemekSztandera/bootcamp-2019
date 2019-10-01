package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    public void whenEmptyStringIsProvidedIntAddShouldReturn0() {
        // arrange
        String string = "";
        // act
        int result = StringCalculator.intAdd(string);
        // assert
        assertThat(result).isEqualTo(0);
    }


    @Test
    public void whenStringParameterDoesNotContainsNumbersIntAddShouldReturn0() {
        // arrange
        String string = "abcd";
        // act
        int result = StringCalculator.intAdd(string);
        // assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenStringParameterContainsNumbersAndOrNonNumbersIntAddShouldReturnSumOfNumbers() {
        // arrange
        String string = "a1b2c3d//";
        // act
        int result = StringCalculator.intAdd(string);
        // assert
        assertThat(result).isEqualTo(6);
    }

}
