package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterCurrencyTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = ConverterCurrency.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen1Dot5555Dlr() {
        float in = 140;
        float expected = 1.5555f;
        float out = ConverterCurrency.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvertZeroRblToEuroThenZeroEuro() {
        float in = 0;
        float eps = 0;
        float expected = ConverterCurrency.rubleToEuro(in);
        float out = 0;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert100RblToDollarThen1Dot1111Dollar() {
        float in = 100;
        float expected = 1.1111F;
        float out = ConverterCurrency.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvertNegativeRblToDollarThenZeroDollar() {
        float in = -80;
        float expected = 0;
        float out = ConverterCurrency.rubleToDollar(in);
        float eps = 0.0F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}



