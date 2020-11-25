package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return (first > third) ? first : third;
        }
        if (second > first) {
          return (second > third) ? second : third;
        }
        return third;
    }
}
