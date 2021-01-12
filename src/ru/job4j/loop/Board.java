package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int z = 0; z < width; z++ ) {
            for (int x = 0; x < height; x++ ) {
                if ((z+x) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}