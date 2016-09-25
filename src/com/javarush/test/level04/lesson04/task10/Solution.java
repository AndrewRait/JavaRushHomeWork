package com.javarush.test.level04.lesson04.task10;

/**
    Три числа
    Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара
    равных между собой чисел.
    Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между
    собой, то вывести все три.
    Пример для чисел 1 2 2:
    2 2
    Пример для чисел 2 2 2:
    2 2 2
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {

          //Легкий способ для фиксированного количества чисел:

            int[] firstMas = new int[3];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 3; i++) {
                firstMas[i] = Integer.parseInt(bufferedReader.readLine());
            }

            if ((firstMas[0] == firstMas[1]) && (firstMas[0] == firstMas[2])) {
                System.out.printf("%d %d %d", firstMas[0], firstMas[1], firstMas[2]);
            }
            else if (firstMas[0] == firstMas[1]) {
                System.out.printf("%d %d", firstMas[0], firstMas[1]);
            }
            else if (firstMas[1] == firstMas[2]) {
                System.out.printf("%d %d", firstMas[1], firstMas[2]);
            }
            else if (firstMas[0] == firstMas[2]) {
                System.out.printf("%d %d", firstMas[0], firstMas[2]);
            }


        /**
        List<Integer> arrayList= new ArrayList<Integer>();
        //int[] firstMas = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            //firstMas[i] = Integer.parseInt(bufferedReader.readLine());
        }

        /*int[] mas = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList[i] = )
            }
        }*/

        /**
        int[] mas = new int[firstMas.length];
        for (int i = 0; i < firstMas.length; i++) {
            for (int j = i + 1; j < firstMas.length; j++) {
                if (firstMas[i] == firstMas[j]) {
                    mas[i] = j;
                    System.out.println(mas[i] + " " + i);
                }
            }
        }
        */

        /**
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Integer am;
        for (Integer integer : arrayList) {
            am = hm.get(integer);
            hm.put(integer, am == null ? 1 : am + 1);
        }

        Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();
        sortedMap.putAll(hm);

        for (int i = 0; i < sortedMap.size(); i++) {
            System.out.println(sortedMap.values());
        }

        /*
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
        for (Map.Entry<Integer, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        */

    }
}