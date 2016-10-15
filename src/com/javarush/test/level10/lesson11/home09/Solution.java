package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
    Одинаковые слова в списке
    Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
    Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
    а второй – число, сколько раз данная строка встречалась в списке.
    Вывести содержимое словаря на экран.
    В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }

        long start = System.currentTimeMillis();
        Map<String, Integer> map = countWords(words);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {

        HashMap<String, Integer> result = new HashMap<>();
        /**int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            String d = list.get(i);
            for (int k = i + 1; k < list.size(); k++) {
                if (d.equals(list.get(k)) && !result.containsKey(d)){
                    count++;
                }
            }
            if (count > 0) {
                count = count + 1;
                result.put(d, count);
            }
            count = 0;
        }*/

        //String s;
        for (String aList : list) {
            //s = list.get(i);
            result.putIfAbsent(aList, 0);
            if (result.containsKey(aList)) {
                result.put(aList, result.get(aList) + 1);
            }
        }

        /**for (String st : list)
            result.merge(st, 1, (a, b) -> a + b);*/
        return result;
    }
}