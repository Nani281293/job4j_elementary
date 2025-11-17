package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != word[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'r', 'l'};
        boolean result = startsWith(word, prefix);
        System.out.println(result);
    }
}
