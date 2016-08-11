package com.javarush.test.level04.lesson04.task05;

/*  Положительное и отрицательное число
    Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
    Если число отрицательное, то прибавить единицу.
    Вывести результат на экран.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter number : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        if (input >= 0) {
            System.out.println(input * 2);
        }
        else System.out.println(input + 1);
    }
}