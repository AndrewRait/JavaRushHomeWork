package com.javarush.test.level10.lesson11.home06;

/**
    Конструкторы класса Human
    Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
    Каждый конструктор должен иметь смысл.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Human {

        private int age;
        private int height;
        private int weight;
        private boolean sex;
        private boolean meried;
        private int money;

        public Human(int age, int height, int weight, int money, boolean sex, boolean meried) {

        }

        public Human(int height, boolean meried) {

        }

        public Human(int weight) {

        }

        public Human(int money, int weight) {

        }

        public Human(boolean sex, int money) {

        }

        public Human(boolean meried) {

        }

        public Human(int age, int height, int weight, int money, boolean sex) {

        }

        public Human(int weight, int money, boolean meried) {

        }

        public Human(int age, int height, boolean sex, boolean meried) {

        }

        public Human(int age, int height, int weight, int money) {

        }
    }
}
