package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 80;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1 euro. Test result : " + passed);
        int in1 = 200;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("200 rubles are 3 dollar. Test result : " + passed1);
    }
}