package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/**
    Удалить все числа больше 10
    Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    Удалить из множества все числа больше 10.
*/

public class Solution {

    public static void main(String[] args) {

        HashSet<Integer> set = createSet();
        System.out.println(set);
        System.out.println(removeAllNumbersMoreThan10(set));
    }


    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i * 2);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        /**HashSet<Integer> newset = new HashSet<>();
        for (Integer integer : set) {
            if (integer <= 10) {
                newset.add(integer);
            }
        }*/
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int hat = iter.next();
            if (hat > 10) {
                iter.remove();
            }
        }

        return set;
    }
}
