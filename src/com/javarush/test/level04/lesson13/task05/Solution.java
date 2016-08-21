package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/**
    Все любят Мамбу
    Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
    Пример текста:
    Света любит меня.
    Света любит меня.
    …
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        loveIs(bufferedReader.readLine());
    }

    private static void loveIs(String s) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s любит меня.\n", s);
        }
    }
}
