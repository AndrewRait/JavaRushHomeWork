package com.javarush.test.level08.lesson11.home06;

import java.util.ArrayList;
import java.util.Collections;

/**
    Вся семья в сборе
    1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
    2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
    3. Вывести все объекты Human на экран.
*/

public class Solution {

    public static void main(String[] args) {

        Human son1 = new Human("Vasya2", true, 20);
        Human son2 = new Human("Vasya3", true, 21);
        Human son3 = new Human("Vasya4", true, 22);

        Human mot = new Human("Valya1", false, 35, son1, son2, son3);
        Human bot = new Human("Vasya1", true, 36, son1, son2, son3);

        Human ded1 = new Human("Vasya0", true, 60, mot);
        Human bab1 = new Human("Valya0", false, 59, mot);

        Human ded2 = new Human("Vasya00", true, 65, bot);
        Human bab3 = new Human("Valya00", false, 64, bot);

        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

        System.out.println(mot);
        System.out.println(bot);

        System.out.println(ded1);
        System.out.println(bab1);

        System.out.println(ded2);
        System.out.println(bab3);
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human... children) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            // Способ через коллекцию:
            Collections.addAll(this.children, children);

            //Через ФорИч:
            /**for (Human aChildren : children) {
             this.children.add(aChildren);
             }*/
            /**for (int i = 0; i < children.length; i++) {
                this.children.add(children[i]);
            }*/
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {

                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {

                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }
}
