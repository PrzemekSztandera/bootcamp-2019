package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegConverterTest {


    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionIfSizeIsInvalid() {
        // arrange
        RegConverter regConverter = new RegConverter();
        String input = "63r7";
        // act
        String result = regConverter.convert(input);
    }


    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionWhenInputContainsNonAlphaNumericValues() {
        // arrange
        RegConverter regConverter = new RegConverter();
        String input = "63r7&";
        // act
        String result = regConverter.convert(input);
    }

    @Test
    public void shouldSwapLetterToNumberWhenMatchingCharacterFound() {
        // arrange
        RegConverter regConverter = new RegConverter();

        String input = "SAGBI";
        // act
        String result = regConverter.convert(input);

        assertThat(result).isEqualTo("54981");
    }
}
