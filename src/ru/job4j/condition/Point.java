package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double a = first + second;
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(3, 5, 7, 9);
        System.out.println("Result (3, 5) to (7, 9) " + result1);
    }
}
