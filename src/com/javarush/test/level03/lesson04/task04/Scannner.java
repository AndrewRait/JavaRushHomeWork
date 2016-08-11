package com.javarush.test.level03.lesson04.task04;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Scannner {

    public static void main(String[] args) {

        long aLong_1 = 0;
        Scanner scanner_y = new Scanner(System.in);
        while (scanner_y.hasNextLong()) {
            aLong_1 = scanner_y.nextLong();
        }

        System.out.println(aLong_1);
        scanner_y.close();

            System.out.println("---------------------------");

        long aLong;
        Scanner scanner_x = null;
        try {
            scanner_x = new Scanner(new File("src/com/javarush/test/level03/lesson04/task04/LongNumber"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert scanner_x != null;
        while (scanner_x.hasNextLong()) {
            aLong = scanner_x.nextLong();
            System.out.println(aLong);
        }
        scanner_x.close();

            System.out.println("---------------------------");

        String input = "1 fish 2 fish red fish blue fish zero";
        Scanner scanner1 = new Scanner(input).useDelimiter("[\t\n\r\f]*fish\\s*"); //!!!!
        //System.out.println(scanner.nextInt());
        //System.out.println(scanner.nextInt());
        //System.out.println(scanner.next());
        //System.out.println(scanner.next());

        while (scanner1.hasNext()) {
            System.out.println(scanner1.next());
        }
        scanner1.close();

            System.out.println("---------------------------");

        Scanner scanner2 = new Scanner(input);
        scanner2.findInLine("([0-9]+) fish (\\d+) fish (\\w+) fish (\\w+) fish"); //!!!!
        MatchResult matchResult = scanner2.match();

        for (int i = 0; i <= matchResult.groupCount(); i++) {                   //!!!!
            System.out.println(matchResult.group(i));                           //!!!!
        }
        scanner2.close();
    }
}
