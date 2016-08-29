package com.javarush.test.level05.lesson05.task05;

import java.util.ArrayList;
import java.util.List;

/**
    Провести три боя  попарно между котами
    Создать три кота используя класс Cat.
    Провести три боя попарно между котами.
    Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
    Результат каждого боя вывести на экран.
*/

public class Solution {

    public static void main(String[] args) {

        Cat cat1 = new Cat("1", 1, 1, 1);
        Cat cat2 = new Cat("2", 2, 2, 2);
        Cat cat3 = new Cat("3", 3, 3, 3);

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (int i = 0; i < cats.size(); i++) {
            for (int k = i + 1; k < cats.size(); k++) {
                System.out.println(cats.get(i).fight(cats.get(k)));
            }
        }
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
