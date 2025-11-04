package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor0Then1() {
        int number = 0;
        int expected = 1;
        long output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int number = 1;
        int expected = 1;
        long output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor4Then24() {
        int number = 4;
        int expected = 24;
        long output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor20Then24() {
        int number = 20;
        long expected = 2432902008176640000L;
        long output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}