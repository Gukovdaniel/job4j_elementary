package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1){
            prime = false;
            System.out.println(prime);
        } else {
            for (int i = 2; i < number; i++) {
                if (number == 1) {
                    prime = false;
                    System.out.println(prime);
                    break;
                }
                if (number % i == 0) {
                    prime = false;
                    System.out.println(prime);
                    break;
                }
                prime = true;
                System.out.println(prime);
                break;
            }
        }
            return prime;
    }

}
