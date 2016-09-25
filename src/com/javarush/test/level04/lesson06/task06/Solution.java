package com.javarush.test.level04.lesson06.task06;

/**
    И 18-ти достаточно
    Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Man man = new Man();
        man.setName(bufferedReader.readLine());
        man.setAge(Integer.parseInt(bufferedReader.readLine()));
        System.out.println(man.getAge() > 20 ? "И 18-ти достаточно" : "");
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
