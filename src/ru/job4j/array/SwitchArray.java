package ru.job4j.array;

public class SwitchArray {
    public static String[] swap(String[] array, int source, int dest) {
        String temporary = array[source];
        array[source] = array[dest];
        array[dest] = temporary;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(num);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
