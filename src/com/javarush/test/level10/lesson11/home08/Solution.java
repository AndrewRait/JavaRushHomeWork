package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/**
    Массив списков строк
    Создать массив, элементами которого будут списки строк.
    Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {

    public static void main(String[] args) {

        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList[] str = new ArrayList[2];
        for (int i = 0; i < str.length; i++) {
            ArrayList<String> name = new ArrayList<>();
            str[i] = name;
            for (int k = 0; k < 3; k++) {
                name.add("Hello" + k);
            }
        }
        return str;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list: arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}