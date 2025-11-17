package ru.job4j.array;

public class FindLoop {

    public static int indexInRage(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int index0f(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int index = indexInRage(data, element, start, finish);
        System.out.println("Индекс элемента = " + index);

        data = new int[]{0, 2, 1, 4};
        element = 4;
        index = index0f(data, element);
        System.out.println("Индекс элемента = " + index);
    }
}



