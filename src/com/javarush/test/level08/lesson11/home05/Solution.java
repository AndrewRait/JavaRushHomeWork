package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
    Мама Мыла Раму. Теперь с большой буквы
    Написать программу, которая вводит с клавиатуры строку текста.
    Программа заменяет в тексте первые буквы всех слов на заглавные.
    Вывести результат на экран.

    Пример ввода:
      мама     мыла раму.

    Пример вывода:
      Мама     Мыла Раму.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] newS = s.split(" ");
        /**for (int i = 0; i < newS.length; i++) {
            System.out.println(newS[i] + " " + i + "length : " + newS[i].length());
        }
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(newS));
        for (int i = 0; i < newS.length; i++) {
            if (newS[i].length() != 0) {
                System.out.print(newS[i] + " ");
                System.out.println("1");
            } else System.out.println("2");
        }
        }*/
        for (String st : newS) {
            //st.replaceFirst("^", st.substring(1).toUpperCase())
            //System.out.printf("%s%s ",st.substring(0, 1).toUpperCase(), st.substring(1));
            System.out.print(st.length() != 0 ? st.substring(0, 1).toUpperCase() + st.substring(1) + " " :
             " ");
            //System.out.print(st.equals(" ") ? "1" : "2");
            /**if (st.length() == 0) {
                System.out.print(st + " ");
                System.out.println("1");
            } else System.out.println("2");*/
        }
    }
}
