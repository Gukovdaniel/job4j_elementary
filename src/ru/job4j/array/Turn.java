package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = array.length - 1; i>=0; i-- ) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            break;
        }

        return array;
    }
}