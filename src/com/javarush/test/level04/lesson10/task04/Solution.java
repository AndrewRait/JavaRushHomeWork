package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/**
    S-квадрат
    Вывести на экран квадрат из 10х10 букв S используя цикл while.
    Буквы в каждой строке не разделять.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        int visota = 0;

        while (visota < 10) {
            int shirina = 0;
            while (shirina < 10){
                System.out.print("S");
                shirina++;
            }
            System.out.println();
            visota++;
        }
    }
}
