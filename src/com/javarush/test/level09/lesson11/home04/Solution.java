package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
    Конвертер дат
    Ввести с клавиатуры дату в формате «08/18/2013»
    Вывести на экран эту дату в виде «AUG 18, 2013».
    Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        Date date = dateFormat.parse(br.readLine());
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(dateFormat2.format(date).toUpperCase());
    }
}