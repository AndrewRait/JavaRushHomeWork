package com.javarush.test.level10.lesson11.bonus03;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Polymorphy {

    private static final String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int STR_LENGTH = 9; // длина генерируемой строки

    public static void main(String[] args) {

        Cow cow = new Cow();
        if (cow instanceof Rocket) {
            Rocket rocket = (Rocket) cow;
            rocket.printSpeed();
        }
        //Rocket rocket = (Rocket) cow;
        cow.printName();
        //rocket.printSpeed();
        cow.printColor();

        String s = "  wh  at   ";
        System.out.println(s);

        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        //String str = "";
        for (int i = 0; i < STR_LENGTH; i ++) {
            int num = random.nextInt(mCHAR.length());
            char ch = mCHAR.charAt(num);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}

class Cow {

    public void printName() {
        System.out.println("I am COW");
    }
    public void printColor() {
        System.out.println("I ma White");
    }
}

class Rocket extends Cow {

    @Override
    public void printName() {
        System.out.println("XXX: I am ROCKET");
    }

    public void printSpeed() {
        System.out.println("Very hi");
    }
}