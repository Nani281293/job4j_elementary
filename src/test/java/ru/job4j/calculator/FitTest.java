package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenman180Then92() {
        short input = 185;
        double expected = 97.75;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenwomen170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womenWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}