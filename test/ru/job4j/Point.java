package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double fst = x2 - x1;
        double sec = y2 - y1;
        double first = Math.pow(fst, 2);
        double second = Math.pow(sec, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 2, 2, 6);
        System.out.println("result (4, 2) to (2, 6) " + result);
    }
}