package com.javarush.test.level09.lesson11.bonus02;


import java.io.*;

/**
     Нужно добавить в программу новую функциональность
     Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
     Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
     Если файла (который нужно копировать) с указанным именем не существует, то
     программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
     а уже потом считывать файл для записи.
*/

public class Solution2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        File file = new File(sourceFileName);

        while (!file.exists()) {
            try {
                System.out.println("Файл не существует.");
                sourceFileName = reader.readLine();
                file = new File(sourceFileName);
            }
            catch (FileNotFoundException e) {
                System.out.println("Ошибка");
            }
        }

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

    }
}

/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String sourceFileName = reader.readLine();
    String destinationFileName = reader.readLine();
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;
    try {
            fileInputStream = new FileInputStream(sourceFileName);
            fileOutputStream = new FileOutputStream(destinationFileName);}
    catch (FileNotFoundException e)
        {
            System.out.println("Файл не существует.");
        }
    sourceFileName = reader.readLine();
    destinationFileName = reader.readLine();
    fileInputStream = new FileInputStream(sourceFileName);
    fileOutputStream = new FileOutputStream(destinationFileName);
            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
 */