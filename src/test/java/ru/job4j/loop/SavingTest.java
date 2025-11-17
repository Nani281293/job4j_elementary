package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SavingTest {

    @Test
    void whenGoal500Deposit100Percent5ThenYears5() {
        double goal = 500;
        double annaulDeposit = 100;
        double percent = 5;
        double expected = 5;
        double output = Saving.years(goal, annaulDeposit, percent);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenGoal1000Deposit200Percent10ThenYears5() {
        double goal = 1000;
        double annaulDeposit = 200;
        double percent = 10;
        double expected = 5;
        double output = Saving.years(goal, annaulDeposit, percent);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenGoal1000Deposit100Percent20ThenYears7() {
        double goal = 1000;
        double annaulDeposit = 100;
        double percent = 20;
        double expected = 7;
        double output = Saving.years(goal, annaulDeposit, percent);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenGoal2000Deposit100Percent30ThenYears7() {
        double goal = 2000;
        double annaulDeposit = 100;
        double percent = 30;
        double expected = 8;
        double output = Saving.years(goal, annaulDeposit, percent);
        assertThat(output).isEqualTo(expected);
    }
}