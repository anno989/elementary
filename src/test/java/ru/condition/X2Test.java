package ru.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA11B11C11X11Then3() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected = 3;
        int rsl = X2.calc1(a1, b1, c1, x1);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA20B21C21X21Then2() {
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expected = 2;
        int rsl = X2.calc2(a2, b2, c2, x2);
        assertThat(rsl).isEqualTo(expected);

    }

    @Test
    void whenA31B31C30X31Then2() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int expected = 2;
        int rsl = X2.calc3(a3, b3, c3, x3);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA41B41C41X40Then1() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int expected = 1;
        int rsl = X2.calc4(a4, b4, c4, x4);
        assertThat(rsl).isEqualTo(expected);
    }
}