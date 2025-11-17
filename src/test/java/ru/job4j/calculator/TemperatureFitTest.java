package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TemperatureFitTest {

    @Test
    void whenRoomTemperature10ThenFurits8() {
        int input = 11;
        double expected = 9.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature10ThenMeat5() {
        int input = 11;
        double expected = 6.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}