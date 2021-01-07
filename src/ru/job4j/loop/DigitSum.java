package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        int x = num;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}

