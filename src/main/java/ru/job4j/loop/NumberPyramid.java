package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            //Печатаем пробелы
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            // Печатаем числа в прямом порядке
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
        }
            // Печатаем числа в обратном порядке
            for (int j = i - 1; j >= 1; j--) {
                System.out.println(j);
            }
            //Переходим на новую строку
        System.out.println();
        }
   }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
