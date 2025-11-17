package ru.job4j.loop;

public class Saving {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            years += 1;
            total += annualDeposit + total * percent / 100;
            System.out.println(years);
            System.out.println(total);
        } while (total <= goal);
        return years;
    }

    public static void main(String[] args) {
        System.out.println(Saving.years(2000, 100, 30));
    }
}
