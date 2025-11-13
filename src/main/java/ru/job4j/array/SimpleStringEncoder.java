package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        String count = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
                count = Integer.toString(counter);
            } else {
                result = result + symbol + count;
                count = "";
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result = result + symbol + count;
        return result;
    }
}
