package com.javarush.test.level08.lesson08.task04;


import java.text.ParseException;
import java.util.*;

/**
    Удалить всех людей, родившихся летом
    Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
    «фамилия» - «дата рождения».
    Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {

    public static void main(String[] args) throws ParseException {

        HashMap<String, Date> map;
        map = createMap();
        for (Map.Entry<String, Date> st : map.entrySet()) {
            System.out.println(st.getKey() + " " + st.getValue().getMonth());
        }

        removeAllSummerPeople(map);

        System.out.println("------DELET---------");
        for (Map.Entry<String, Date> st : map.entrySet()) {
            System.out.println(st.getKey() + " " + st.getValue().getMonth());
        }
    }

    public static HashMap<String, Date> createMap() {

        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallonee", new Date("JULY 1 1980"));
        map.put("Stalloneee", new Date("AUGUST 1 1980"));
        map.put("Stalloneeee", new Date("SEPTEMBER 1 1980"));
        map.put("Stalloneeeee", new Date("SEPTEMBER 1 1980"));
        map.put("Stalloneeeeee", new Date("OCTOBER 1 1980"));
        map.put("Stalloneeeeeee", new Date("OCTOBER 1 1980"));
        map.put("Stalloneeeeeeee", new Date("MARCH 1 1980"));
        map.put("Stalloneeeeeeeee", new Date("OCTOBER 1 1980"));
        map.put("Stalloneeeeeeeeee", new Date("MARCH 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
                //int temp = iterator.next().getValue().getMonth();

                //Date tempo = iterator.next().getValue();
                //SimpleDateFormat sdf = new SimpleDateFormat("M");
                //String dateInString = iterator.next().getValue().toString();
            Date date = iterator.next().getValue();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int temp = calendar.get(Calendar.MONTH);
                /**SimpleDateFormat format = new SimpleDateFormat("M");
                Calendar.set(tempo);
                cal.get(tempo);
                format.get*/
            if ((temp == 5 || temp == 6 || temp == 7)) {
                iterator.remove();
            }

            /**System.out.println(tempo);*/
        }
    }
}
