package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); ) { //убрали увеличение i внутрь цикла

            System.out.println("До IF : " + list.get(i) + " || I = " + i);
            if (list.get(i) > 5) {
                System.out.println(list.get(i));
                list.remove(i);
            }//не увеличиваем i, если удалили текущий  элемент
            else
                i++;
        }

        System.out.println("_____________________");
        list.forEach(System.out::println);
    }
}
