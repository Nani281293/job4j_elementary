package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        int source = 0;
        int destination = 1;
        int[] result1 = swap(number, source, destination);
        for (int number1 : result1) {
            System.out.println(number1);
        }

        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result2 = swapBorder(numbers);
        for (int number2 : result2) {
            System.out.println(number2);
        }
    }
}
