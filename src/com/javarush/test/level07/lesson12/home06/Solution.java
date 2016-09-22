package com.javarush.test.level07.lesson12.home06;

/**
    Семья
    Создай класс Human с полями имя(String), пол(boolean),возраст(int),
    отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
    Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
    Примечание:
    Если написать свой метод String toString() в классе Human, то именно он
    будет использоваться при выводе объекта на экран.
    Пример вывода:
    Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
    Имя: Катя, пол: женский, возраст: 55
    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {

    public static void main(String[] args) {

        Human ded1 = new Human("Vasya1", true, 55, null, null);
        Human ded2 = new Human("Vasya2", true, 56, null, null);

        Human bab1 = new Human("Valya1", false, 50, null, null);
        Human bab2 = new Human("Valya2", false, 51, null, null);

        Human ot = new Human("Otto", true, 31, ded1, bab1);
        Human mat = new Human("Matta", false, 32, ded2, bab2);

        Human ch1 = new Human("Ch1", true, 18, ot, mat);
        Human ch2 = new Human("Ch2", true, 19, ot, mat);
        Human ch3 = new Human("Ch3", false, 20, ot, mat);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());

        System.out.println(bab1.toString());
        System.out.println(bab2.toString());

        System.out.println(ot.toString());
        System.out.println(mat.toString());

        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age, Human father, Human mother) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
