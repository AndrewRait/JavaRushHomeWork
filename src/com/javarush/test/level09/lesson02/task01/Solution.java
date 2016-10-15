package com.javarush.test.level09.lesson02.task01;

import java.util.Arrays;

/**
    Каждый метод должен возвращать свой StackTrace
    Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution{

    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement st : ste) {
            System.out.println(st.getMethodName());
        }
        return ste;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement st : ste) {
            System.out.println(st.getMethodName());
        }
        return ste;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement st : ste) {
            System.out.println(st.getMethodName());
        }
        return ste;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement st : ste) {
            System.out.println(st.getMethodName());
        }
        return ste;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement st : ste) {
            System.out.println(st.getMethodName());
        }
        return ste;
    }
}
