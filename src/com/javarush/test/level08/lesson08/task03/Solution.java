package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/**
    Одинаковые имя и фамилия
    Создать словарь (Map<String, String>) занести в него десять записей по принципу
    «Фамилия» - «Имя».
    Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Ivanov", "Ivan");
        hashMap.put("Ivanovа", "Ivanf");
        hashMap.put("Ivanovаа", "Ivanff");
        hashMap.put("Ivanovааа", "Ivanfff");
        hashMap.put("Ivanovаааа", "Ivanfff");
        hashMap.put("Ivanovааааа", "Ivanffff");
        hashMap.put("Ivanovаааааа", "Ivanff");
        hashMap.put("Ivanovааааааа", "Ivan");
        hashMap.put("Ivanovаааааааа", "Ivan");
        hashMap.put("Ivanovааааааааа", "Ivan");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> st : map.entrySet()) {
            if (st.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> st : map.entrySet()) {
            if (st.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}
