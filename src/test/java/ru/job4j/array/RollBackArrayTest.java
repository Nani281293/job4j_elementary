package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class RollBackArrayTest {

    @Test
    void whenEmpty() {
        int[] array = {};
        int[] result = {};
        int[] expected = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenOne() {
        int[] array = {1};
        int[] expected = {1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenFull() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTheSame() {
        int[] array = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }
}