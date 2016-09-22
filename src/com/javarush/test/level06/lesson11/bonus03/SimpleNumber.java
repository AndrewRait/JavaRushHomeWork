package com.javarush.test.level06.lesson11.bonus03;

public class SimpleNumber {

    public static void main(String[] args) {

        num:
        for (int num = 2; num <= 100; num++) {
            System.out.println("----------------" + num + "-------------");
            System.out.println("Начало цикла");
            int n = (int)Math.sqrt(num) + 1;
            System.out.println("n : " + n);

            while (--n != 1) {
                System.out.println("--n : " + n);
                if (num % n == 0) {
                    System.out.println("К метке");
                    continue num;
                }
            }

            System.out.println("num : " + num + " ");
        }
    }
}
