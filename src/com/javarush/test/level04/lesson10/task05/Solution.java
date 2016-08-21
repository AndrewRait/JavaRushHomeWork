package com.javarush.test.level04.lesson10.task05;

import java.io.*;
import java.util.Timer;

/**
    Таблица умножения
    Вывести на экран таблицу умножения 10х10 используя цикл while.
    Числа разделить пробелом.
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    ...
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        long timeStart = System.currentTimeMillis();
        int visota = 1;

        while (visota <= 10) {
            int shirina = 1;
            while (shirina <= 10) {
                /**
                String s = String.valueOf(visota * shirina);
                StringBuilder str = new StringBuilder(s);
                str.append(" ");
                System.out.print(str);
                */
                System.out.print((visota * shirina) + " ");
                shirina++;
            }

            System.out.println();
            visota++;
        }

        long timeStop = System.currentTimeMillis();
        System.out.println(timeStop - timeStart);
    }
}
