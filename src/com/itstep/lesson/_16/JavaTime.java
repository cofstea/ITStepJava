package com.itstep.lesson._16;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTime {

    public static void main(String[] args) throws InterruptedException {

        // String text = "Hello each second - ";
        // LocalTime start = LocalTime.now();
        // LocalTime end = LocalTime.now().plusSeconds(552455623);
        // System.out.println(Duration.between(end, start).toHours());

        //
        // do {
        //     System.out.println(text + LocalTime.now());
        //     Thread.sleep(1000); // Pause for 1 second
        // }
        // while (LocalTime.now().isBefore(end));

        LocalDateTime time =  LocalDateTime.now();
        System.out.println("Time in Chisinau is:" + time.toString());
        ZonedDateTime zonedDateTime = ZonedDateTime.from(time)
                .withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("Time in Paris is:" + zonedDateTime.toString());

    }

}
