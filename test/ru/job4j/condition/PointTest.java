package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
       Point a = new Point(0, 0);
       Point b = new Point(2, 0);
       int expected = 2;
       double out = a.distance(b);
       Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when35To79Then5() {
        Point a = new Point(3, 5);
        Point b = new Point(7, 9);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.7);

    }

    @Test
    public void when46To89Then5() {
        Point a = new Point(4, 6);
        Point b = new Point(8, 9);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when23To57Then5() {
        Point a = new Point(2, 3);
        Point b = new Point(5, 7);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To022To064Then10() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 2);
        Point c = new Point(2, 0, 0);
        int expected = 2;
        double out = a.distance3d(c);
        Assert.assertEquals(expected, out, 0.01);
    }
}