package com.javarush.test.level04.lesson06.task01;

/*  Минимум двух чисел
    Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        int[] mas = new int[2];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }

        //System.out.println(mas[0] > mas[1] ? "" + mas[0] : "" + mas[1]);
        System.out.println(Math.min(mas[0], mas[1]));
    }
}