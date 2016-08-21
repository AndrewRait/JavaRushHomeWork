package com.javarush.test.level04.lesson06.task04;

/*  Сравнить имена
    Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] mas = new String[2];
        int i = 0;

        while (i < 2) {
            mas[i] = bufferedReader.readLine();
            i++;
        }

        equalsName(mas);
        /**
        if (mas[0].equals(mas[1])) {
            System.out.println("Имена идентичны");
        }
        else if ((!mas[0].equals(mas[1])) && (mas[0].length() == mas[1].length())) {
            System.out.println("Длины имен равны");
        }
        */
    }

    private static void equalsName(String[] args) {
        if (args[0].equals(args[1])) {
            System.out.println("Имена идентичны");
        }
        else if ((!args[0].equals(args[1])) && (args[0].length() == args[1].length())) {
            System.out.println("Длины имен равны");
        }
    }
}
