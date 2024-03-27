package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {
    @Test
    void whenP6K2Square2() {
            int expected = 2;
            int p = 6;
            double k = 2;
            double out = SqArea.square(p, k);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }
    @Test
    void whenP8K4Square2() {
        int expected = 2;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.6));
    }
    @Test
    void whenP9K6Square2() {
        int expected = 2;
        int p = 9;
        double k = 6;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.5));
    }
}



