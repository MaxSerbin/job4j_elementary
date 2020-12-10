package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {30, 40, 10, 20, 50};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 20, 30, 40, 50};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }
}