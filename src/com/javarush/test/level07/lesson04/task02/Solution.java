package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
    Массив из строчек в обратном порядке
    1. Создать массив на 10 строчек.
    2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
    3. Вывести содержимое всего массива (10 элементов) на экран в
    обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        String[] stringArray = new String[10];
        //Arrays.fill(stringArray, "");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < stringArray.length - 2; i++) {
            stringArray[i] = br.readLine();
        }

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
        /**
        Arrays.sort(stringArray, Collections.reverseOrder());
        for (String st : stringArray) {
            System.out.println(st);
        }*/
    }
}