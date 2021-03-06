package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/**
    Хорошего не бывает много
    Ввести с клавиатуры строку и число N.
    Вывести на экран строку N раз используя цикл while.
    Пример ввода:
    абв
    2
    Пример вывода:
    абв
    абв
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(bufferedReader.readLine());

        outWord(s, a);
    }

    private static void outWord(String s, int i) {
        while (i > 0) {
            System.out.println(s);
            i--;
        }
    }
}
