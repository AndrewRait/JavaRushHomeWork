package com.javarush.test.level04.lesson07.task04;

/**
    Положительные и отрицательные числа
    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество
    отрицательных чисел в исходном наборе,
    в следующем виде:
    "количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
    Пример для чисел 2 5 6:
    количество отрицательных чисел: 0
    количество положительных чисел: 3
    Пример для чисел -2 -5 6:
    количество отрицательных чисел: 2
    количество положительных чисел: 1
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        int countPlus = 0;
        int countMinus = 0;
        int[] mas = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (Integer iterMas : mas) {
            if (iterMas > 0) {
                countPlus++;
            }
            else if (iterMas < 0) {
                countMinus++;
            }
        }

        System.out.printf("количество отрицательных чисел: %d \nколичество положительных чисел: %d",
                countMinus, countPlus);
    }
}
