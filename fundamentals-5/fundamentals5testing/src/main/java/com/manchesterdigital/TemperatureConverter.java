package com.manchesterdigital;

public class TemperatureConverter {
    public static final String CELSIUS_UNIT = "C";
    public static final String FAHRENHEIT_UNIT = "F";

    public static double convert(String unitToConvertTo, int temperature) {
        if(!unitToConvertTo.equalsIgnoreCase(CELSIUS_UNIT) &&
                !unitToConvertTo.equalsIgnoreCase(FAHRENHEIT_UNIT)) {
            throw new InvalidConversionException("Provided invalid unit: " + unitToConvertTo);
        }

        if(unitToConvertTo.equalsIgnoreCase(CELSIUS_UNIT)) {
            return calculateCelsiusToFahrenheit(temperature);
        }
        return calculateFahrenheitToCelsius(temperature);
    }

    private static double calculateCelsiusToFahrenheit(int celsiusValue) {
        return Math.floor((celsiusValue - 32) * 5 / 9);
    }
    private static double calculateFahrenheitToCelsius(int fahrenheitValue) {
        return Math.floor((fahrenheitValue * 9 / 5) + 32);
    }
}
