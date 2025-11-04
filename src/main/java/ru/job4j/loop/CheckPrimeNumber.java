package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number <= 2) {
            return false;
        }
        boolean num = true;
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    num = false;
                    break;
                }
            }
        return num;
        }

        public static void main(String[]args) {
        System.out.println(check(17));
        }
}
