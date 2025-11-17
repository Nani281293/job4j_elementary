package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLenght3AndWidth4Diagonal5() {
        double lenght = 3;
        double width = 4;
        double expected = 5;
        double output = Rectangle.diagonal(lenght, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLenght5AndWidth12Diagonal13() {
        double lenght = 5;
        double widht = 12;
        double expected = 13;
        double output = Rectangle.diagonal(lenght, widht);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLenght7AndWidth24Diagonal25() {
        double lenght = 7;
        double width = 24;
        double expected = 25;
        double output = Rectangle.diagonal(lenght, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}