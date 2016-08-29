package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
    Задача по алгоритмам
    Написать программу, которая:
    1. вводит с консоли число N > 0
    2. потом вводит N чисел с консоли
    3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int length;

        do {
            length = Integer.parseInt(reader.readLine());
        } while (length < 0);

        for (int i = 0; i < length; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        maximum = list.get(length - 1);

        System.out.println(maximum);
    }
}
