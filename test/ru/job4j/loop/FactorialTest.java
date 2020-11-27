package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }
}