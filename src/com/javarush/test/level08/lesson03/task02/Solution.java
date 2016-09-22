package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Map;

/**
    HashMap из 10 пар
    Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
    арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт,
    дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода,
    ирис - цветок, картофель - клубень.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка):
    картофель - клубень
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        Map<String, String> set = new HashMap<String, String>();
        set.put("арбуз", "ягода");
        set.put("банан", "трава");
        set.put("вишня", "ягода");
        set.put("груша", "фрукт");
        set.put("дыня", "овощ");
        set.put("ежевика", "куст");
        set.put("жень-шень", "корень");
        set.put("земляника", "ягода");
        set.put("ирис", "цветок");
        set.put("картофель", "клубень");

        for (Map.Entry<String, String> entry : set.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
