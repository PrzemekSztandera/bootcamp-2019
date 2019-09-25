package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TemperatureConverterTest {

    @Test
    public void whenFahrenheitIsZeroThenCelsiusIsMinus17() {
        // arrange
        String unitToConvertTo = "C";
        int temperature = 0;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(-17.0);
    }

    @Test
    public void whenFahrenheitIs100ThenCelsiusIs38() {
        // arrange
        String unitToConvertTo = "C";
        int temperature = 100;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(38.0);
    }
}
