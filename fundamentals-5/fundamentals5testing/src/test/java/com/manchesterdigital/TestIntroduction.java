package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestIntroduction {

    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

    // BDD STYLE
    @Test
    public void givenBankAccountWhenInputThenDeposited() {

    }

    @Test
    public void shouldAddTwoNumbers() {
        // arrange
        int first = 23;
        int second = 23;

        // act
        int result = first + second;

        // assert
        assertThat(result).isEqualTo(45);
    }
}
