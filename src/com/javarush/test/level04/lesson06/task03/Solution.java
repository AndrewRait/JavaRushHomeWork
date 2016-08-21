package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (Integer sort : list) {
            System.out.println(sort);
        }

        /**
         * list.forEach(System.out::println);
         */
    }
}
