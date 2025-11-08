package ru.job4j.array;

public class FindLoop {
    public static int index0f(int[] data, int element) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {0, 2, 1, 4};
        int element = 4;
        int index = index0f(data, element);
        System.out.println("Индекс элемента = " + index);
}
}



