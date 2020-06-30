package com.itstep.lesson._14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class TimeDemo {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().minusMonths(4).getMonth().maxLength());


        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(Period.between(LocalDate.now(),LocalDate.of(2020,6,1)).getDays());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd ha:mm:ss");
        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 2, 2, 59);
        System.out.println(formatter.format(dateTime));
    }
}
