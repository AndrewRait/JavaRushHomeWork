package com.javarush.test.level05.lesson05.task05;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class Test {

    private String voi;
    public static void main(String[] args) {

        /**
        http://info.javarush.ru/javarush_articles/2015/12/02/%D0%A1%D1%80%D0%B0%D0%B2
         %D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BE%D0%
         B2-%D0%BF%D1%80%D0%B0%D0%BA%D1%82%D0%B8%D0%BA%D0%B0.html
         */

        String str1 = "String";
        String str2 = "String";
        String str3 = "Str";
        String str4 = "ing";
        String str5 = "Str" + "ing";

        System.out.println(str1 == (str3 + str4) ? "true" : "false");
        System.out.println(str1 == str2 ? "true" : "false");
        System.out.println(str1 == str5 ? "true" : "false");

        String str6 = "String";
        String str7 = new String("string");
        System.out.println(str6.intern() == (str3 + str4).intern() ? "true" : "false");

        System.out.println(1333e-3);

        float f1 = 0.0f/1.0f;
        float f2 = 0.0f/-1.0f;
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("f1==f2: "+(f1==f2));
        float f3 = 1.0f / f1;
        float f4 = 1.0f / f2;
        System.out.println("f3="+f3);
        System.out.println("f4="+f4);

        System.out.println("------------------------------");
        int i1 = Float.floatToIntBits(f1);
        int i2 = Float.floatToIntBits(f2);
        System.out.println("i1 (+0.0):"+ Integer.toBinaryString(i1));
        System.out.println("i2 (-0.0):"+ Integer.toBinaryString(i2));
        System.out.println("i1==i2: "+(i1 == i2));
        System.out.println("\u3AFD");
        char q = (char) 65807;
        System.out.println("\uD83D\uDE0C");


        System.out.println(StringReverseTest.canAccessPrivateMethods());
        /**
        try {
            String priwet = "\uD83D" + "\uDE0C" + "!";
            byte[] utf8Bytes = priwet.getBytes("UTF-32BE");
            String priwet2 = new String(utf8Bytes, "UTF-32BE");
            System.out.println(priwet2);
        }
        catch (UnsupportedEncodingException e) {}

        System.out.println("---------------------------------");

        SortedMap<String, Charset> charsetsMap = Charset.availableCharsets();
        System.out.println("Charsets available: "+charsetsMap.size());
        for(String name : charsetsMap.keySet()) {
            Charset charset = charsetsMap.get(name);
            StringBuffer sb = new StringBuffer();
            sb.append(name);
            sb.append(" (");
            for (Iterator<String> aliases = charset.aliases().iterator(); aliases.hasNext(); ) {
                sb.append(aliases.next());
                if (aliases.hasNext())
                    sb.append(",");
            }
            sb.append(")");
            System.out.println(sb.toString());
        }
        */

        /**
        char[][] mas = new char[2000][32];
        char ch = 0;
        for (int i = 0; i < mas.length; i ++) {
            for (int k = 0; k < mas[i].length; k++) {
                char c = ch++;
                if (ch != 65535) {
                    mas[i][k] = (c);
                }
                else break;
            }
        }

        for (int i = 0; i < mas.length; i ++) {
            for (int k = 0; k < mas[i].length; k++) {
                System.out.printf("%2s", mas[i][k]);
            }
            System.out.println();
        }
        */
    }
}
