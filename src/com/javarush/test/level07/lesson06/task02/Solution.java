package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
    Самая длинная строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        //list.forEach(System.out::println);

        /**while (true) {
            String s = br.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }*/

        max = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                index = i;
            }
        }

        System.out.println(list.get(index));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(index).length() == list.get(i).length() && index != i) {
                System.out.println(list.get(i));
            }
        }
    }
}
