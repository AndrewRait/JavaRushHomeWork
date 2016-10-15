package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
    Нужно добавить в программу новую функциональность
    Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
    Новая задача: Программа должна работать не с номерами домов, а с городами:
    Пример ввода:
    Москва
    Ивановы
    Киев
    Петровы
    Лондон
    Абрамовичи

    Лондон

    Пример вывода:
    Абрамовичи
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //Так же через МАП, но будут уникальными ключи.
        List<String> city = new ArrayList<>();
        List<String> family = new ArrayList<>();
        while (true) {

            String city1 = reader.readLine();

            if (city1.isEmpty()) break;
            city.add(city1);
            String family1 = reader.readLine();
            family.add(family1);
        }

        //read home number
        String city2 = reader.readLine();

        /**
        if (0 <= houseNumber && houseNumber < addresses.size()) {

            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
        for (int i = 0; i < city.size(); i++) {

            if (city.get(i).equals(city2)) {
                System.out.println(family.get(i));
            }
        }
    }
}
