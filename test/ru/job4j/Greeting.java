package ru.job4j;

public class Greeting {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        String idea = "I Like Java!";
        System.out.println(idea);
        idea = idea + "But I am a newbie ";
        int year = 2020;
        idea = idea + year;
        System.out.println(idea);
    }
}
