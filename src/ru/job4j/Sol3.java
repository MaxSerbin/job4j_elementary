package ru.job4j;

public class Sol3 {
    public static int xxx(int n) {
        for (int index = n - 1; index >= 0; index++) {
            return index;
        }
         return 0;
    }

    public static void main(String[] args) {
        System.out.println(Sol3.xxx(9));
    }

}
