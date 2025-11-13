package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizintal(char[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if ((board[row][cell]) != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X')
            && (monoVertical(board, i) || monoHorizintal(board, i))) {
                return true;
            }
        }
        return false;
    }
}
