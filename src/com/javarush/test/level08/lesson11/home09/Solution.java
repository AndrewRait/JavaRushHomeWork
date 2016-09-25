package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.Date;

/**
    Работа с датой
    1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество
    дней с начала года - нечетное число, иначе false
    2. String date передается в формате MAY 1 2013
    Не забудьте учесть первый день года.
    Пример:
    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution {

    public static void main(String[] args) throws Exception{

        String s = "JANUARY 2 2020";
        boolean x = isDateOdd(s);
        System.out.println(s + " = " + x);
    }

    // МЕТОД НУЖНО ЗАМЕНИТЬ В СООТВЕТСТВИИ С JAVA 8
    public static boolean isDateOdd(String date) {

        Date dat = new Date(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dat);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        return days % 2 != 0;
    }
}
