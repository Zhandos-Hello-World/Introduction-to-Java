package com.company;

public class Main {
    public static void main(String[] args) {
        double miles = 24.0;
        double timeHour = 1.0;
        double timeMinutes = 40.0;
        double second = 35.0;
        double timeHourRes = timeHour + (timeMinutes / 60) + (second / 3600);
        double km = miles * 1.6;
        double res = km / timeHourRes;
        System.out.println(res);
    }
}
