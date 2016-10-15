package com.javarush.test.level10.lesson11.bonus03;


import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.Collectors;

public class Test {

    public static final int MASK_8BIT = 8;
    public static final int MASK_6BIT = 6;

    public static void main(String[] args) {

        String s = String.join(" / ", "Mama", "Wash", "Brash");
        System.out.println(s);

        List<String> strings = new ArrayList<>();
        strings.add("Mama");
        strings.add("Moma");
        strings.add("Moma");

        /**strings.stream()
                .filter(i -> i != null || i.isEmpty())
                .collect(Collectors.joining(", "));*/

        System.out.println(strings.stream()
                .filter(i -> i != null || i.isEmpty())
                .collect(Collectors.joining(", ")));

        Map<String, Integer> map = new HashMap<>();
        strings.forEach(st -> map.merge(st, 1, (a, b) -> a + b));

        /**for (String st : strings) {
            map.merge(st, 1, (a, b) -> a + b);
        }*/

        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

        LongAccumulator a = new LongAccumulator((o, b) -> o + b, 0);
        a.accumulate(1);
        a.accumulate(2);
        a.accumulate(3);
        a.accumulate(4);
        a.longValue();
        System.out.println(a);

        byte[] z = {0, 0, 1, 0, 1, 1, 1, 0};
        split(z);
        for (byte g : z) {
            System.out.println(g);
        }
    }

    private static int[] split(byte[] src){
        assert (src.length == 3) : "Source array length should be equal to 3";
        int result[] = new int[4];
        int _24bit = 0;
        for(int i = 0; i < src.length ; i++){
            _24bit += (src[i] & MASK_8BIT) << (8*(2-i));
        }
        for(int i=0; i<result.length ; i++){
            result[i] = (_24bit >> (6*(3-i))) & MASK_6BIT;
        }
        return result;
    }
}