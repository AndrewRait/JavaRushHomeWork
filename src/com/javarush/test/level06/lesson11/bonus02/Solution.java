package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
    Нужно добавить в программу новую функциональность
    Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
    Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
    Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы
    он мог описать данную ситуацию.
    Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
    Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

    Пример ввода:
    дедушка Вася
    бабушка Мурка
    папа Котофей
    мама Василиса
    сын Мурчик
    дочь Пушинка

    Пример вывода:
    Cat name is дедушка Вася, no mother, no father
    Cat name is бабушка Мурка, no mother, no father
    Cat name is папа Котофей, no mother, father is дедушка Вася
    Cat name is мама Василиса, mother is бабушка Мурка, no father
    Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
    Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName, null, null);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {

        private String name;
        //private Cat parent;
        private Cat parentM;
        private Cat parentF;

        /**Cat(String name) {

            this.name = name;
        }

        /**Cat(String name, Cat parent) {

            this.name = name;
            this.parent = parent;
        }*/

        Cat(String name, Cat parentM, Cat parentF) {

            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;
        }

        @Override
        public String toString() {

            /**if (parent == null && parentF == null && parentM == null)
                return "Cat name is " + name + ", no mother, " + "no father";
            /**else if (parentF == null && parentM != null)
                return "Cat name is " + name + ", mother is " + parentM.name + " , no father";
            else if (parentF != null && parentM == null)
                return "Cat name is " + name + ", no mother, " + "father is " + parentF.name;*/

                return "Cat name is " + name +
                        (parentM != null ? ", mother is " + parentM.name : ", no mother") +
                        (parentF != null ? ", father is " + parentF.name : ", no father");
        }
    }
}

/**
 * String GFName = reader.readLine();
 String GMName = reader.readLine();
 String fatherName = reader.readLine();
 String motherName = reader.readLine();
 String sonName = reader.readLine();
 String daughterName = reader.readLine();
 Cat GF = new Cat(GFName, null, null);
 Cat GM = new Cat(GMName, null, null);
 Cat catFather = new Cat(fatherName, GF, null);
 Cat catMother = new Cat(motherName, null, GM);
 Cat catSon = new Cat(sonName, catFather, catMother);
 Cat catDaughter = new Cat(daughterName, catFather, catMother);
 System.out.println(GF);
 System.out.println(GM);
 System.out.println(catFather);
 System.out.println(catMother);
 System.out.println(catSon);
 System.out.println(catDaughter);
 }
 public static class Cat
 {
 private String name;
 private Cat father;
 private Cat mother;
 Cat(String name)
 {
 this.name = name;
 this.father = null;
 this.mother = null;
 }
 Cat(String name, Cat father, Cat mother)
 {
 this.name = name;
 this.father = father;
 this.mother = mother;
 }
 @Override
 public String toString()
 {
 if ((mother == null) && (father == null))
 return "Cat name is " + name + ", no mother, no father";
 else if (father == null)
 return "Cat name is " + name + ", mother is " + mother.name + ", no father";
 else if (mother == null)
 return  "Cat name is " + name + ", no mather" + ", father is " + father.name;
 else
 return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
 }
 }
 */
