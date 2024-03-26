package ru.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {
    @Test
    void whenA11B11C11X11Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA20B21C21X21Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);

    }

    @Test
    void whenA31B31C30X31Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA41B41C41X40Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }
}