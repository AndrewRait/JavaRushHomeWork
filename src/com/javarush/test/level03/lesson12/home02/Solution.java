package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

public class Solution {

    public static void main(String[] args) {

        String str = "Я не хочу изучать Java, я хочу большую зарплату";
        repiatWord(str, 10);
    }

    public static void repiatWord(String str, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
