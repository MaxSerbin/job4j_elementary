package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = Math.max(first, third);
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}
