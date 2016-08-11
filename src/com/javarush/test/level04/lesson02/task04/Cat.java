package com.javarush.test.level04.lesson02.task04;

/*  Реализовать метод setName
    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение
    переменной private String fullName равное значению локальной переменной String fullName.
*/

public class Cat {

    private String fullName;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Vasya", "Pupkin");
        System.out.println(cat.getFullName());
    }

    public void setName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }
}
