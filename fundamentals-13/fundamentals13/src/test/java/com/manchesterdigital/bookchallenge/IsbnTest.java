package com.manchesterdigital.bookchallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsbnTest {

    @Test(expected = InvalidIsbnException.class)
    public void shouldThrowExceptionWhenNumberOfDigitInISBNIsNotEqual13() {
        // given
        Isbn isbn = new Isbn();
        String isbnOfLength10 = "0123456789";
        // then
        isbn.validateIsbn13(isbnOfLength10);
    }

    @Test
    public void shouldReturnBooleanWhenISBNHasAValidNumberOfDigits() {
        // given
        Isbn isbn = new Isbn();
        String isbnOfLength13 = "012-345-678-9012";
        // when
        boolean result = isbn.validateIsbn13(isbnOfLength13);
        // then
        assertThat(result).isInstanceOf(Boolean.class);
    }



    @Test(expected = InvalidIsbnException.class)
    public void shouldThrowExceptionWhenISBNContainsUnsupportedCharacters() {
        // supported characters: digit, hyphen, space
        // given
        Isbn isbn = new Isbn();
        String isbnWithUnsupportedCharacter = "01234%56@789012";
        // when
        isbn.validateIsbn13(isbnWithUnsupportedCharacter);
    }

    @Test(expected = InvalidIsbnException.class)
    public void shouldThrowExceptionWhenISBNContainsBothHyphensAndSpaces() {
        // supported characters: digit, hyphen, space
        // given
        Isbn isbn = new Isbn();
        String isbnWithUnsupportedCharacter = "01234-56 789012";
        // when
        isbn.validateIsbn13(isbnWithUnsupportedCharacter);
    }


    @Test
    public void calculateCheckDigitShouldCalculateLastDigitOfGivenIsbnNumber() {
        // supported characters: digit, hyphen, space
        // given
        Isbn isbn = new Isbn();
        String validISBN = "9780596809485";
        // when
        String result = Isbn.calculateCheckDigit(validISBN);
    }
}
