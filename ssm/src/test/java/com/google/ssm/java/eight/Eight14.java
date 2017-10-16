package com.google.ssm.java.eight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Eight14 {

    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00"));
//        System.out.println(format);


        LocalDateTime localDateTime = LocalDateTime.now().minusHours(1);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);
    }
}
