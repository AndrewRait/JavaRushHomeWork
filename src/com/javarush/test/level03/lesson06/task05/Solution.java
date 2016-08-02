package com.javarush.test.level03.lesson06.task05;

/* Изучаем японский
Выведи на экран 日本語
*/

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) {

        System.out.println("日本語");
        System.out.printf("%5d%n%6d%n%7d%n", 55555, 4444, 333);
        System.out.printf("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
        formatter.format("%5d%n%6d%n%7d%n", 55555, 4444, 333);

        System.out.format("\nLocal time: %tT", Calendar.getInstance());
    }
}