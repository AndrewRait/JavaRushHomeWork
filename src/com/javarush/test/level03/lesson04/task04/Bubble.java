package com.javarush.test.level03.lesson04.task04;


public class Bubble {

    public static void main(String[] args)
    {
        int[] mas = new int[]{10,9,8,7,6,5,4,3,2,1};
        /*for (int i = 0; i < mas.length; i++) {
            System.out.print((mas[i] = ((int)(Math.random() * 100))) + "    ");
        }*/

        //System.out.println();
        //bubbleSortDownToUp(mas);
        System.out.println();
        bubbleSortUpToDown(mas);
    }

    public static void bubbleSortDownToUp(int[] data) {
        for (int bar = data.length - 1; bar >= 0; bar--) {
            for (int index = 0; index < bar ; index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                }
                System.out.println("BAR : " + bar + " || INDEX : " + index);
                for (Integer mas : data) {
                    System.out.print(mas + "    ");
                }
                System.out.println();
            }
        }

        for (Integer mas : data) {
            System.out.print(mas + "    ");
        }
    }

    public static void bubbleSortUpToDown(int[] data) {
        for (int bar = 0; bar < data.length - 1; bar++) {
            for (int index = data.length - 2; index >= bar ; index--) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                }
                System.out.println("BAR : " + bar + " || INDEX : " + index);
                for (Integer mas : data) {
                    System.out.print(mas + "    ");
                }
                System.out.println();
            }
        }

        for (Integer mas : data) {
            System.out.print(mas + "    ");
        }
    }
}
