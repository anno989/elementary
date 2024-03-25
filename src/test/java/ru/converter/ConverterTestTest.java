package ru.converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTestTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert140RblThen1Dot5555Dlr() {
        float in = 140;
        float expected = 1.5555f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }
    @Test
    void whenConvertZeroRblToEuroThenZeroEuro() {
        float in = 0;
        float expected = 0;
        float result = Converter.rubleToEuro(in);
        assertEquals(expected, result);
    }
    @Test
    void whenConvert100RblToDollarThen1Dot1111Dollar() {
        float in = 100;
        float expected = 1.1111F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    void whenConvertNegativeRblToDollarThenZeroDollar() {
        float in = -50;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        assertEquals(expected, out);
    }
    @Test
    void testRubleToDollarNegative() {
        assertEquals(0.0, Converter.rubleToDollar(-50), 0.0001);
        assertEquals(0.0, Converter.rubleToDollar(-100), 0.0001);
    }
}
