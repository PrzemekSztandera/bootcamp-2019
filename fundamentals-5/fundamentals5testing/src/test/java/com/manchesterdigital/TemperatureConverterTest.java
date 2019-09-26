package com.manchesterdigital;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TemperatureConverterTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // ----- FAHRENHEIT TO CELSIUS TESTS -----

    @Test
    public void whenFahrenheitIs0ThenCelsiusIsMinus17() {
        // arrange
        String unitToConvertTo = TemperatureConverter.CELSIUS_UNIT;
        int temperature = 0;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(-17.0);
    }


    @Test
    public void whenFahrenheitIs100ThenCelsiusIs38() {
        // arrange
        String unitToConvertTo = TemperatureConverter.CELSIUS_UNIT;
        int temperature = 100;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(37.0);
    }

    @Test
    public void whenFahrenheitIs50ThenCelsiusIs10() {
        // arrange
        String unitToConvertTo = TemperatureConverter.CELSIUS_UNIT;
        int temperature = 50;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(10.0);
    }

    // ----- CELSIUS TO FAHRENHEIT TESTS -----


    @Test
    public void whenCelsiusIs0ThenFahrenheitIs32() {
        // arrange
        String unitToConvertTo = TemperatureConverter.FAHRENHEIT_UNIT;
        int temperature = 0;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(32);
    }



    @Test
    public void whenCelsiusIs35ThenFahrenheitIs95() {
        // arrange
        String unitToConvertTo = "F";
        int temperature = 35;
        // act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);
        // assert
        assertThat(result).isEqualTo(95);
    }

    @Test(expected = InvalidConversionException.class)
    public void whenConversionUnitIsNotValidThenExceptionThrown() {
        TemperatureConverter.convert("fdfdfasfafsg", 0);
    }

    @Test
    public void whenConversionUnitIsNotValidThenExceptionThrown2() {
        expectedException.expect(InvalidConversionException.class);
        TemperatureConverter.convert("fdfdfasfafsg", 0);

        assertThat(expectedException).isInstanceOf(InvalidConversionException.class);
    }
}
