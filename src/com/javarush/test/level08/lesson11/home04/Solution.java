package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.min;

/**
    Минимальное из N чисел
    1. Ввести с клавиатуры число N.
    2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
    3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        return min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        return list;
    }
}
