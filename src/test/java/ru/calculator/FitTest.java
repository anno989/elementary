package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan187then100dot05() {
        short in = 187;
        double expected = 100;
        double out = Math.round(Fit.manWeight(in));
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenWoman168then66() {
        short in = 168;
        double expected = 67;
        double out = Math.round(Fit.womanWeight(in));
        assertThat(out).isEqualTo(expected);
    }
}
