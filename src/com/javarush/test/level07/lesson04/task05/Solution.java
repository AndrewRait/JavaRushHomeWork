package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
    Один большой массив и два маленьких
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        int[] array = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];
        int[] arr2 = new int[10];

        System.arraycopy(array, 0, arr, 0, 10);
        System.arraycopy(array, 10, arr2, 0, 10);

        for (Integer in : arr2) {
            System.out.println(in);
        }
    }
}
