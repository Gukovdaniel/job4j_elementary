package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива " + prices.length);
        String[] names = new String[4];
        names[0] = "Ярослава";
        names[1] = "Мария";
        names[2] = "Настя";
        names[3] = "Ира";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
