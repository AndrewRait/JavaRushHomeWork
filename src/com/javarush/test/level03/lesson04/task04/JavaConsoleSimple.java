package com.javarush.test.level03.lesson04.task04;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaConsoleSimple {

    static void print(Set<String> words, String prefix) {
        if (words.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        Iterator<String> iter = words.iterator();
        while(iter.hasNext()) {
            String value = iter.next();
            Set<String> nextSet = new HashSet<String>(words);
            nextSet.remove(value);
            print(nextSet, prefix + " " + value);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        words.add("Мама");
        words.add("Мыла");
        words.add("Раму");
        print(words, "");
    }
}

