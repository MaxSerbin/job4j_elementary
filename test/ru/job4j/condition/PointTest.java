package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
       int x1 = 0;
       int y1 = 0;
       int x2 = 2;
       int y2 = 0;
       int expected = 2;
       double out = Point.distance(x1, y1, x2, y2);
       Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when35To79Then5() {
        int x1 = 3;
        int y1 = 5;
        int x2 = 7;
        int y2 = 9;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.7);

    }

    @Test
    public void when46To89Then5() {
        int x1 = 4;
        int y1 = 6;
        int x2 = 8;
        int y2 = 9;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when23To57Then5() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}