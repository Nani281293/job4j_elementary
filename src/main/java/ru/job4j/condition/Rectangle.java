package ru.job4j.condition;

public class Rectangle {

    public static double diagonal(double lenght, double width) {
        return Math.sqrt(Math.pow(lenght, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with lenght 3 and widht 4 is " + result);
    }
}
