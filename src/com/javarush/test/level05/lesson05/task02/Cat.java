package com.javarush.test.level05.lesson05.task02;

/*
    Реализовать метод fight
    Реализовать метод boolean fight(Cat anotherCat):
    реализовать механизм драки котов в зависимости от их веса, возраста и силы.
    Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
    т.е. возвращать true, если выиграли и false - если нет.
    Должно выполняться условие:
    если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat {

    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    /**
    public Cat(int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    */

    public boolean fight(Cat anotherCat) {

        boolean result;
        int aFight = this.age - anotherCat.age;
        int wFight = this.weight - anotherCat.weight;
        int sFight = this.strength - anotherCat.strength;
        int sum = aFight + wFight + sFight;
        result = sum > 0;

        return result;
    }

    /**
    public static void main(String[] args) {

        Cat cat1 = new Cat(10, 10, 10);
        Cat cat2 = new Cat(34, 34, 34);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
    */
}
