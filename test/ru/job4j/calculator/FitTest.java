package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan186Then98() {
        short in = 186;
        double expected = 98;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.99);
    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        double expected = 63;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.99);
    }
}