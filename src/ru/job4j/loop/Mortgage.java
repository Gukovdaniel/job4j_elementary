package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double arrears = amount + amount *(percent/100);
        while (arrears > salary) {
            year++;
            arrears -= salary;
            arrears = arrears + arrears *(percent/100);
        }
        return year;

    }
}