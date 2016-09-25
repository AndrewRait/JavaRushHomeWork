package com.javarush.test.level04.lesson06.task05;

/**
    18+
    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Man man = new Man();
        man.setName(bufferedReader.readLine());
        man.setAge(Integer.parseInt(bufferedReader.readLine()));
        System.out.println(man.getAge() < 18 ? "Подрасти еще" : "");
    }
}

class Man {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
