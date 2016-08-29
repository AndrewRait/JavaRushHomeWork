package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/**
    Меня зовут 'Вася'...
    Ввести с клавиатуры строку name.
    Ввести с клавиатуры дату рождения (три числа): y, m, d.
    Вывести на экран текст:
    «Меня зовут name
    Я родился d.m.y»
    Пример:
    Меня зовут Вася
    Я родился 15.2.1988
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        int mas[] = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = "Меня зовут ";

        String name = br.readLine();


        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(br.readLine());
        }


        StringBuilder sb = new StringBuilder(string);
        sb.append(name);
        sb.append("\n");
        sb.append("Я родился ");
        sb.append(mas[2]);
        sb.append(".");
        sb.append(mas[1]);
        sb.append(".");
        sb.append(mas[0]);
        System.out.println(sb);


        //System.out.printf("\nМеня зовут %s\nЯ родился %d.%d.%d", name, mas[0], mas[1], mas[2]);
    }
}
