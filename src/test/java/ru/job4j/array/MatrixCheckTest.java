package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixCheckTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizintal(board, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNotMonoHorizontal() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizintal(board, row);
        assertThat(result).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int cell = 2;
        boolean result = MatrixCheck.monoVertical(board, cell);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasMonoNotVertical() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {'X', ' ', 'X'}
        };
        int cell = 1;
        boolean result = MatrixCheck.monoVertical(board, cell);
        assertThat(result).isFalse();
    }
}