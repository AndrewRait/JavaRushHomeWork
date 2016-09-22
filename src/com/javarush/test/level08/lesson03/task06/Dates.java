package com.javarush.test.level08.lesson03.task06;


import java.util.Date;

public class Dates {

    public static void main(String[] args) throws Exception{

        Date currentTime = new Date();
        System.out.println("Current time: " + currentTime);

        System.out.println("-----------------------------");
        //--------------------------------------------------

        Date currentTime2 = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - currentTime2.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");

        System.out.println("-----------------------------");
        //--------------------------------------------------

        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(5001);              // ждем 3 секунды

        Date currentTime3 = new Date();
            //проверяем что время currentTime после endDate
        if (currentTime3.after(endDate)) {
                System.out.println("End time!");
        }

        System.out.println("-----------------------------");
        //----------------------------------------------------

        Date currentTime4 = new Date();
        int hours = currentTime4.getHours();
        int mins = currentTime4.getMinutes();
        int secs = currentTime4.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        System.out.println("-----------------------------");
        //----------------------------------------------------

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);       // первое число
        yearStartTime.setMonth(0);      // месяц январь, нумерация для месяцев 0-11

        Date currentTime5 = new Date();
        long msTimeDistance = currentTime5.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);    //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }
}
