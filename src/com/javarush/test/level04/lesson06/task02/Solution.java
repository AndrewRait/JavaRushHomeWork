package com.javarush.test.level04.lesson06.task02;

/*  Максимум четырех чисел
    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        /**
        int[] mas = new int[4];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }
        */

        //Как сделать рекурсию?

            //С помощью методов МАТ
            /**
            int maxNumber = Math.max(mas[0], Math.max(mas[1], Math.max(mas[2], mas[3])));
            System.out.printf("%d", maxNumber);
            */


            //Поиск и присваивание максимального/минимального значения
            /**
            int max = mas[0];
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] > max) {
                    max = mas[i];
                }
            }
            System.out.println(max);
            */

            //С помощью методов класса Arrays
            /**
            Arrays.sort(mas);
            System.out.println(mas[0]);
            */

        //Сортировка стандартным классом Comparator

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader bFArrayL= new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            list.add(Integer.parseInt(bFArrayL.readLine()));
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.toString().compareTo(o2.toString());
            }
        });

        System.out.println(list.get(0));

        int[] mas = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            mas[i] = list.get(i);
        }

        System.out.println((Arrays.toString(mas)).replaceAll("(\\[|\\]|,| )", ""));
            //Лямбда-выражение:
            /**
             * Collections.sort(list, (o1, o2) -> o1.toString().compareTo(o2.toString()));
             * System.out.println(list.get(0));
             */
    }

    //Попытка переопределить метод туСтринг, получился новый метод...
    /**
    public static String toString(List<Integer> a) {
        if (a == null)
            return "null";
        int iMax = a.size() - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append("");
        for (int i = 0; ; i++) {
            b.append(a.get(i));
            if (i == iMax)
                return b.append("").toString();
            b.append("\n");
        }
    }
     */
}