package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
    Слова в обратном порядке
    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и
    выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        list.remove(2);
        Collections.reverse(list);
        for (String st : list) {
            System.out.println(st);
        }
    }
}
