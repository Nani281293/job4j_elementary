package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            if (i != data[0]) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = {false, false, false};
        boolean result = mono(data);
        System.out.println(result);
    }
}
