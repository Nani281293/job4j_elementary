package ru.job4j.loop;

public class Factorial {
    public static long calculate(int number) {
        long result = 1;
        for (long index = result; index <= number; index++) {
            if (index <= number) {
                result = result * index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial number 0 = " + Factorial.calculate(0));
        System.out.println("Factorial number 1 = " + Factorial.calculate(1));
        System.out.println("Factorial number 4 = " + Factorial.calculate(4));
        System.out.println("Factorial number 20 = " + Factorial.calculate(20));
    }
}

