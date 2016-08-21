package com.javarush.test.level04.lesson07.task03;

/*
    Положительные числа
    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
    Пример для чисел -4 6 6:
    2
    Пример для чисел -6 -6 -3:
    0
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        int count = 0;
        int[] mas = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (Integer iterMas : mas) {
            if (iterMas > 0) {
                count++;
            }
        }

        System.out.printf("%d", count);
    }
}
