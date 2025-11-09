package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        for (int index = 0; index < postfix.length; index++) {
            return postfix[postfix.length - index - 1] == word[word.length - index - 1];
        }
        return false;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        System.out.println(endsWith(word, postfix));
    }
}
