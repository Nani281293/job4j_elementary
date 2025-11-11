package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int i = FindLoop.indexInRage(data, min, index, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {3, 4, 1, 2, 5};
        data = sort(data);
        for (int i : data) {
            System.out.println(i);
        }
    }
}
