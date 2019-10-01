package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ByteConverterTest {

    @Test
    public void when1024IsProvidedShouldReturn1() {
        // arrange
        int mBytes = 1024;
        // act
        String result = ByteConverter.convert(mBytes);
        // assert
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void when2048KBisProvidedShouldReturn2() {
        // arrange
        int mBytes = 2048;
        // act
        String result = ByteConverter.convert(mBytes);
        // assert
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void when512KBisProvidedShouldReturn512() {
        // arrange
        int mBytes = 512;
        // act
        String result = ByteConverter.convert(mBytes);
        // assert
        assertThat(result).isEqualTo("512");
    }

    @Test
    public void when1030KBisProvidedShouldReturn1and6() {
        // arrange
        int mBytes = 1030;
        // act
        String result = ByteConverter.convert(mBytes);
        // assert
        assertThat(result).isEqualTo("1 6");
    }

    @Test
    public void when0KBisProvidedShouldReturn0() {
        // arrange
        int mBytes = 0;
        // act
        String result = ByteConverter.convert(mBytes);
        // assert
        assertThat(result).isEqualTo("0");
    }


}
