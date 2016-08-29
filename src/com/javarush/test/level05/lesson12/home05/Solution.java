package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
    Вводить с клавиатуры числа и считать их сумму
    Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
    Вывести на экран полученную сумму.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean sum = false;
        int sums = 0;

        while (!sum) {
            String str = br.readLine();
            if (!str.equals("сумма")) {
                list.add(Integer.parseInt(str));
            }
            else sum = true;
        }

        for (Integer aList : list) {
            sums += aList;
        }

        System.out.println(sums);
    }
}
