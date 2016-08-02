package com.javarush.test.level03.lesson04.task04;


public class Sort {
    public static void main(String[] args)
    {
        int[] mas = new int[]{10,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < mas.length; i++) {
            System.out.print((mas[i] = ((int)(Math.random() * 100))) + "    ");
        }

        //System.out.println("\n");
        //selectSort_1(mas);
        System.out.println("\n");
        selectSort_2(mas);
    }

    public static void selectSort_1(int[] data) {
        for (int bar = 0; bar < data.length; bar++) {
            for (int index = bar; index < data.length; index++) {
                if (data[bar] > data[index]) {
                    int temp = data[bar];
                    data[bar] = data[index];
                    data[index] = temp;
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

    public static void selectSort_2(int[] data) {
        for (int bar = 0; bar <= data.length - 1; bar++) {
            int min = bar;
            for (int index = bar; index <= data.length - 1; index++) {
                if (data[min] > data[index]) {
                    min = index;
                }
                System.out.println("BAR : " + bar + " || INDEX : " + index);
                for (Integer mas : data) {
                    System.out.print(mas + "    ");
                }
            }
            int temp = data[min];
            data[min] = data[bar];
            data[bar] = temp;
            System.out.println();
        }

        for (Integer mas : data) {
            System.out.print(mas + "    ");
        }
    }
}
