package com.javarush.test.level04.lesson06.task07;

/**
    Три числа
    Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
    Вывести на экран порядковый номер числа, отличного от остальных.
    Пример для чисел 4 6 6:
    1
    Пример для чисел 6 6 3:
    3
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        int[] mas = new int[3];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
            map.put(i, mas[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int k = i + 1; k < mas.length; k++) {
                if ((mas[i] == mas[k]) && (!list.contains(mas[i]))) {
                    list.add(mas[i]);
                }
            }
        }

        int[] array = new int[list.size()];
        int[] hashmapKey = new int[map.size()];
        int[] hashmapValues = new int[map.size()];


        /**Iterator<Integer> arrayIter = list.iterator();
        int i = 0;
        while (arrayIter.hasNext()) {
            array[i] = list.get(i);
            i++;
            arrayIter.next();
        }
        */

        int arr = 0;
        for (Integer x : list) {
            array[arr] = x;
        }

        int maps = 0;
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            hashmapKey[maps] = map1.getKey();
            hashmapValues[maps] = map1.getValue();
            maps++;
        }

        for (int anArray : array) {
            for (int x = 0; x < hashmapValues.length; x++) {
                if (anArray != hashmapValues[x]) {
                    System.out.println(hashmapKey[x] + 1);
                }
            }
        }


        /** Итераторы для Мар:
         // 1.
         for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
         System.out.println(map1.getKey() + " - " + map1.getValue());
         }

         // 2.
         for (String key: hashmap.keySet())
         System.out.println(hashmap.get(key));

         // 3.
         Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
         while (itr.hasNext())
         System.out.println(itr.next());
        */

        /** Неиспользованный код:
         Iterator mapIterator = map.entrySet().iterator();
         Map.Entry<Integer, Integer> map1 = map.entrySet();
         int equals = 0;
         while (mapIterator.hasNext()) {
         if (array[equals] == mapIterator.next().)
         }
        */
    }
}