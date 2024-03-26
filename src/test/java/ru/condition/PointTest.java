package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to22then2dot8284() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.8284F;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }
}