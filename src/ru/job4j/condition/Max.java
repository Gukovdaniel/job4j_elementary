package ru.job4j.condition;

public class Max {
    public static String liken(int a, int b) {
        String num = a > b ? "a" : "b";
        return num;
    }

    public static void main(String[] args) {
        String msg = Max.liken(1, 3);
        System.out.println(msg);
    }
}