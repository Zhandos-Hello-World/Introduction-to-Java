package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        long a = str.nextLong();
        System.out.print(convertMillis(a));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        return currentHour + ":" + currentMinute + ":" + currentSecond;
    }
}
