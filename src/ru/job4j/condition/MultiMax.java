package ru.job4j.condition;

import java.lang.Math;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = Math.max(first, second);
        if (result > third) {
          return result;
        } else {
          return third;
        }
     }
}
