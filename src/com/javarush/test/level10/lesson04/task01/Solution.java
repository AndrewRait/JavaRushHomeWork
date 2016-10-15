package com.javarush.test.level10.lesson04.task01;

/**
    Задача №1 на преобразование целых типов
    Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
    int a = 0;
    int b = (byte) a + 46;
    byte c = (byte) (a*b);
    double f = (char) 1234.15;
    long d = (short) (a + f / c + b);
*/

public class Solution {

    public static void main(String[] args) {

        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        short z = (short) (a + f / c + b);
        System.out.println("a : " + a);
        System.out.println("Long Bits a : " + Long.toBinaryString(a));
        System.out.println("b : " + b);
        System.out.println("Long Bits b : " + Long.toBinaryString(b));
        System.out.println("a * b = " + (a * b));
        System.out.println("Long Bits c : " + Long.toBinaryString(c));
        System.out.println("c : " + c);
        System.out.println("Long Bits f : " + Long.toBinaryString(Double.doubleToLongBits(f)));
        System.out.println("f : " + f);
        System.out.println("a + f : " + a + f);
        System.out.println("Long Bits a + f : " + Long.toBinaryString(Double.doubleToLongBits(a + f)));
        System.out.println("c + b : " + c + b);
        System.out.println("Long Bits c + b : " + Long.toBinaryString(c + b));
        System.out.println("d : " + d);
        System.out.println("Long Bits d : " + Long.toBinaryString(d));
        System.out.println("z : " + z);
        System.out.println("Long Bits z : " + Long.toBinaryString(z));
    }
}