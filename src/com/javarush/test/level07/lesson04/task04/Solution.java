package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
    Массив из чисел в обратном порядке
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Расположить элементы массива в обратном порядке.
    4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        Integer[] array = new Integer[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        reversArray(array);

        for (Integer arr2 : array) {
            System.out.println(arr2);
        }
    }

    public static <T> T[] reversArray(T[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
