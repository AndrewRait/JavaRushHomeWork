package com.javarush.test.level05.lesson05.task05;


public class Test2 {

    public static void main(String[] args) {

        int x = 1, y, z;
        y = ++x;
        z=x++;
        System.out.println("X : " + x + "||Y : " + y + "||Z : " + z);

        x = 1;
        System.out.println("x=" + x + " ++x=" + ++x); // вывод x=1 ++x=2
        x = 1;
        System.out.println("x=" + x + " x++=" + x++); // вывод x=1 x++=1
        System.out.println(x);
    }

    public void initialize() {

    }
}
