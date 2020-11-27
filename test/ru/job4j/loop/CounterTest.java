package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToFifteenThenFiftySix() {
        int rsl = Counter.sumByEven(2, 15);
        assertThat(rsl, is(56));
    }

    @Test
    public void whenSumEvenNumbersFromEightToFourtyFiveThenFourNineFour() {
        int rsl = Counter.sumByEven(8, 45);
        assertThat(rsl, is(494));
    }
}