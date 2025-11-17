package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMiltiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifAnddiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double sumSummAndMultiplyAndDiffAnddiv(double first, double second) {
        return  sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMiltiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifAnddiv(10, 20));
        System.out.println("Результат расчета равен: " + sumSummAndMultiplyAndDiffAnddiv(10, 20));
    }
}
