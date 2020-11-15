package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double sPre = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sPre);
    }
    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("Area 2,2,2 = " + result);
    }
}
