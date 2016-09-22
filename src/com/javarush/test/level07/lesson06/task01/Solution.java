package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;
import java.util.List;

/**
    5 различных строчек в списке
    1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution {

    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<String>();
        list.add("what");
        list.add("a");
        list.add("fuck");
        list.add("stupid");
        list.add("nigga?");

        System.out.println(list.size());
        //list.forEach(System.out::println);
        for (String str : list) {
            System.out.println(str);
        }

        list.set(0, "one");
        list.set(0, "one");
        list.set(0, "one");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
