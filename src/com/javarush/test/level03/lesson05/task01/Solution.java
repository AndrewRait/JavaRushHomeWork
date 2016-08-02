package com.javarush.test.level03.lesson05.task01;

/* Измените программу
Подумайте, что делает программа.
Измените метод public static void printFullName(Student student).
Метод должен выводить полное ФИО студента на экран.
Слова разделить пробелом.
Пример вывода:
Mark Elliot Zuckerberg
*/

public class Solution {

    public static void main(String[] args) {

        Student student = new Student();
        student.firstName = "Mark";
        student.middleName = "Elliot";
        student.lastName = "Zuckerberg";
        printFullName(student);

        StringBuilder sb = new StringBuilder("asdasd");
        System.out.println("\nLength : " + sb + " " + sb.length());
        System.out.println("Capacity : " + sb + " " + sb.capacity());

        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114};
        String fourth = new String(habrAsArrayOfBytes);
        System.out.println(fourth);
    }

    public static void printFullName(Student student) {
        String bar = " ";
        StringBuilder sb = new StringBuilder();
        String s1 = student.firstName;
        String s2 = student.middleName;
        String s3 = student.lastName;
        System.out.println(String.join(bar, s1, s2, s3));
        sb.append(student.firstName);
        sb.append(bar);
        sb.append(student.middleName);
        sb.append(bar);
        sb.append(student.lastName);
        //System.out.print(student.firstName + " " + student.middleName + " "
                //+ student.lastName);
        System.out.println(sb.toString());
    }

    public static class Student {
        public String firstName;
        public String middleName;
        public String lastName;
    }
}