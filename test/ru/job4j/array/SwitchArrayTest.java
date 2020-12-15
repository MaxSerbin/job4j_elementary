package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        String[] input = {"1", "2", "3", "4"};
        String[] expect = {"4", "2", "3", "1"};
        String[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to3() {
        String[] input = {"1", "2", "3", "4"};
        String[] expect = {"1", "2", "4", "3"};
        String[] rsl = SwitchArray.swap(input, 2, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to0() {
        String[] input = {"1", "2", "3", "4"};
        String[] expect = {"2", "1", "3", "4"};
        String[] rsl = SwitchArray.swap(input, 1, 0);
        assertThat(rsl, is(expect));
    }
}