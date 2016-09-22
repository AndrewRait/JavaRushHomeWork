package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
    Задача по алгоритмам
    Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
    Пример ввода:
    3
    2
    15
    6
    17
    Пример вывода:
    2
    3
    6
    15
    17
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] firstMas = new int[5];

        /**
        for (int i = 0; i < firstMas.length; i++) {
            firstMas[i] = Integer.parseInt(reader.readLine());
        }
        */

        int[] test = new int[1000];
        for (int i = 0; i < test.length; i++) {
            test[i] = (int)(Math.random() * 1000);
        }

        long start = System.currentTimeMillis();
        sortMasInsert(test);
        long end = System.currentTimeMillis();
        System.out.println("ВРЕМЯ : " + (end - start));
        for (Integer mas : test) {
            System.out.println(mas);
        }
        //long end = System.currentTimeMillis();
        System.out.println("ВРЕМЯ : " + (end - start));
    }

    //Метод пузырька :
    public static void sortMasBubble(int[] arr) {
        for (int bar = 0; bar < arr.length - 1; bar++) {
            for (int ind = arr.length - 2; ind >= bar; ind--) {
                if (arr[ind] > arr[ind + 1]) {
                    int tmp = arr[ind];
                    arr[ind] = arr[ind + 1];
                    arr[ind + 1] = tmp;
                }
            }
        }
    }

    //Метод пузырька (2) :
    public static void sortMasBubble2(int[] arr) {
        for (int bar = arr.length - 1; bar >= 0; bar--) {
            for (int ind = 0; ind < bar; ind++) {
                if (arr[ind] > arr[ind + 1]) {
                    int tmp = arr[ind];
                    arr[ind] = arr[ind + 1];
                    arr[ind + 1] = tmp;
                }
            }
        }
    }

    //Метод выборки :
    public static void sortMasChosen(int[] arr) {
        for (int bar = 0; bar < arr.length - 1; bar++) {
            for (int ind = bar + 1; ind < arr.length; ind++) {
                if (arr[bar] > arr[ind]) {
                    int tmp = arr[ind];
                    arr[ind] = arr[bar];
                    arr[bar] = tmp;
                }
            }
        }
    }

    //Метод выборки с запоминанием элемента (особого прироста не заметил)
    //скорее всего неправильный метод :
    public static void sortMasChosen2(int[] arr) {
        for (int bar = 0; bar < arr.length - 1; bar++) {
            int minElem = bar;
            int temp = arr[bar];
            for (int ind = bar + 1; ind < arr.length; ind++) {
                if (temp > arr[ind]) {
                    minElem = ind;
                    temp = arr[ind];
                }
            }

            int temps = arr[minElem];
            arr[minElem] = arr[bar];
            arr[bar] = temps;
        }
    }

    //Метод выборки:
    public static void sortMasChosen3(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

        	/*Предполагаем, что первый элемент (в каждом
           	подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;

        	/*В оставшейся части подмножества ищем элемент,
           	который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {

                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            /*Если нашелся элемент, меньший, чем на текущей позиции,
          	меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    //Метод вставки:
    public static void sortMasInsert(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // запомним i-ый элемент
            int temp = arr[i];

            //будем идти начиная с i-1 элемента
            int j = i-1;
            while((j >= 0) && (arr[j] > temp)) {

            // пока не достигли начала массива
            // или не нашли элемент больше i-1-го
            // который храниться в переменной temp
                arr[j + 1] = arr[j];
                //проталкиваем элемент вверх
                j--;
            }

            // возвращаем i-1 элемент
            arr[j + 1] = temp;
        }
    }
}