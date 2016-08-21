package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/**
    Рисуем прямоугольник
    Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    Пример: m=2, n=4
    8888
    8888
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        square(Integer.parseInt(bufferedReader.readLine()), Integer.parseInt(bufferedReader.readLine()));
    }

    private static void square(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int z = 0; z < b; z++) {
                System.out.print("8");
            }

            System.out.println();
        }
    }
}
