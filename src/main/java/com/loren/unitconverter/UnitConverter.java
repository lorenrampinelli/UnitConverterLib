package com.loren.unitconverter;

public class UnitConverter {

    // it converts Celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // it converts fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // it converts fm to mi
    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    // it converts mi to Km
    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    // it converts kg to lb
    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

        // it converts lb to kg
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}