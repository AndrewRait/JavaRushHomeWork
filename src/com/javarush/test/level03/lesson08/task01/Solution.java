package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        /*InputStream inputStream = System.in;
        Reader iSReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(iSReader);

        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = bufferedReader.readLine();

        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", name,
                nAge);*/
        initialization();
        //Scanner scanner = new Scanner(System.in);
        //scanner.nextLine();
    }

    public static class Hero {

        String name = "";
        int age;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void initialization() throws IOException {

        /*InputStream inputStream = System.in;
        Reader iSReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(iSReader);*/
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        Hero hero = new Hero();
        System.out.println("Введите имя :\n");
        hero.setName(bufferedReader.readLine());
        System.out.println("Введите количество лет :\n");
        hero.setAge(Integer.parseInt(bufferedReader.readLine()));

        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", hero.getName(),
                hero.getAge());
    }
}