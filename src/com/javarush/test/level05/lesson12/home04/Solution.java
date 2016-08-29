package com.javarush.test.level05.lesson12.home04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
    Вывести на экран сегодняшнюю дату
    Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution {

    public static void main(String[] args) {

        //System.out.printf("%tD", Calendar.getInstance());

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
