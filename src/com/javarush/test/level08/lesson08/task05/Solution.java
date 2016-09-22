package com.javarush.test.level08.lesson08.task05;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
    Удалить людей, имеющих одинаковые имена
    Создать словарь (Map<String, String>) занести в него десять записей по
    принципу «фамилия» - «имя».
    Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static void main(String[] args) {

        HashMap<String, String> hashMap;
        hashMap = createMap();
        for (Map.Entry<String, String> st : hashMap.entrySet()) {
            System.out.println(st);
        }

        System.out.println("----------DELET----------");

        removeTheFirstNameDuplicates(hashMap);

        for (Map.Entry<String, String> st : hashMap.entrySet()) {
            System.out.println(st);
        }
    }
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        List<String> list = new ArrayList<>();
        List<String> clone = new ArrayList<>();
        //HashMap<String, String> clon = new HashMap<>();
        for (Map.Entry<String, String> st : map.entrySet()) {
            list.add(st.getValue());
        }

        for (int i = 0; i < list.size()-1; i++) {
            for (int k = i + 1; k < list.size(); k++) {
                if(list.get(i).equals(list.get(k)) &&
                !clone.contains(list.get(i))) {
                    //clon.put("1" + i, list.get(i));
                    clone.add(list.get(i));
                }
            }
        }

        System.out.println("=============");
        for (String st2 : clone) {
            System.out.println(st2);
        }
        System.out.println("=============");
        for (String aClone : clone) {
            removeItemFromMapByValue(map, aClone);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
