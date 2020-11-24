package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}