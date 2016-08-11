package com.javarush.test.level04.lesson04.task09;

/*  Светофор
    Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение
    трех минут горит зеленый сигнал,
    затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем
    опять зеленый горит три минуты и т. д.
    Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
    Определить, сигнал какого цвета горит для пешеходов в этот момент.
    Результат вывести на экран в следующем виде:
    "зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
    Пример для числа 2.5:
    зеленый
    Пример для числа 3:
    желтый
    Пример для числа 4:
    красный
    Пример для числа 5:
    зеленый
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(bufferedReader.readLine());

        if ((minute % 5) < 3) {
            System.out.println("зеленый");
        }
        else if (((minute % 5) >= 3) && ((minute % 5) < 4)) {
            System.out.println("желтый");
        }
        else System.out.println("красный");
    }
}

/*
    1 - 3(2,99999) - зеленый
    3 - 4(3,99999) - желтый
    4 - 5(4,99999) - красный
    22 / 5 = 4,4 - зеленый
    23 / 5 = 4,6
    24 / 5 = 4,8
 */