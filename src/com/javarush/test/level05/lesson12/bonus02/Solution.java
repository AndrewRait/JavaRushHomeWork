package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
    Нужно добавить в программу новую функциональность
    Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
    Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = Integer.parseInt(reader.readLine());
        //int b = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int minimum = min(list);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(List<Integer> list) {

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.toString().compareTo(o2.toString());
            }
        });

        return list.get(0);
    }
}
