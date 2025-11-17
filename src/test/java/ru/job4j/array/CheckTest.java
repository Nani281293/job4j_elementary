package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckTest {

    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = {false, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}