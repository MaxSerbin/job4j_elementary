package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax7To5Then7() {
        int result = Max.max(7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax8To10Then10() {
        int result = Max.max(8, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax11() {
        int result = Max.max(3, 10, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenMax12() {
        int result = Max.max(3, 10, 11, 12);
        assertThat(result, is(12));
    }
}