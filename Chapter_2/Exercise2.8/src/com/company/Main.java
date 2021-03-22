package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str =  new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = str.nextInt()+1;
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours+gmt) % 24;

        System.out.println("The current time is " + currentHour  + ":" + currentMinute + ":" + currentSecond);

}
}
