package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки.
Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        Set<String> col = new HashSet<String>();
        col.add("Мама");
        col.add("Мыла");
        col.add("Раму");
        print(col, "");
        //col.forEach(System.out::println);
    }

    static void print(Set<String> words, String prefix) {
        if (words.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (String value : words) {
            Set<String> nextSet = new HashSet<String>(words);
            nextSet.remove(value);
            print(nextSet, prefix + value);
        }
    }
}