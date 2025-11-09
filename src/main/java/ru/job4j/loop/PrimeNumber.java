package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int index = 2; index <= finish; index++) {
            if (CheckPrimeNumber.check(index)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(51));
    }
}
