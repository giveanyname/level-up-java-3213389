package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;

public class App {
    // Create function to calculate the date that's
    // 100 days from now
    public static String getDay(LocalDate tDate) {
        return tDate.plusDays(100).toString();
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("100 days from now is... " + getDay(today)
        /* add function call */);
    }
}
