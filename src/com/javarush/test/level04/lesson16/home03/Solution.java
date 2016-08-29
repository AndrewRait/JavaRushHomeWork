package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
    Посчитать сумму чисел
    Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
    вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = true;
        int sum = 0;

        while (stop) {
            int a = Integer.parseInt(br.readLine());
            if (a == -1) {
                list.add(a);
                stop = false;
            }
            else list.add(a);
        }

        for (Integer aList : list) {
            sum += aList;
        }

        System.out.println(sum);
    }
}
