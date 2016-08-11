package com.javarush.test.level04.lesson04.task07;


import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;

public class Java8Time {

    public static void main(String[] args) {
        // Получае текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);

        //Создадим LocalDate и в качестве аргументов
        //укажем год месяц и день
        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        System.out.println("Дата с указанием года, месяца и дня : " + specificDate);


        //А теперь попробуем хитрость. Укажем дату с ошибкой
        //LocalDate invDate = LocalDate.of(2014, Month.JULY, 33);
        //Но получим исключение java.time.DateTimeException:
        //Invalid value for DayOfMonth (valid values 1 - 28/31): 33

        //Получаем дату, например с 01.01.1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("Дата с начала отсчета времени : " + dateFromBase);

        LocalDate day256_2017 = LocalDate.ofYearDay(2017, 256);
        System.out.println("256 день 2017 : " + day256_2017);

        // Получаем текущее время
        LocalTime time = LocalTime.now();
        System.out.println("Получаем текущее время : " + time);

        //Создаем LocalTime с использование своих данных в качестве параметров
        LocalTime specificTime = LocalTime.of(23, 15, 11, 22);
        System.out.println("Какое-то время дня : " + specificTime);

        //Получаем дату через 2000 секунд после 01.01.1970
        LocalTime sec2000 = LocalTime.ofSecondOfDay(10000);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + sec2000);
    }
}
