package com.loren.unitconverter;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, UnitConverter.celsiusToFahrenheit(0), 0.001);

    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, UnitConverter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    public void testKilometersToMiles() {
        assertEquals(6.21371, UnitConverter.kilometersToMiles(10), 0.00001);
    }

    @Test
    public void testMilesToKilometers() {
        assertEquals(10.0, UnitConverter.milesToKilometers(6.21371), 0.001);
    }

    @Test
    public void testKilogramsToPounds() {
        assertEquals(22.0462, UnitConverter.kilogramsToPounds(10), 0.0001);
    }

    @Test
    public void testPoundsToKilograms() {
        assertEquals(10.0, UnitConverter.poundsToKilograms(22.0462), 0.001);
    }
}