package com.company;

public class Main {
    public static void main(String[] args) {
        double km = 14.0;
        double mile = 14.0 / 1.6;
        double timeMinute = 45.5;
        double timeHour = 45.5 / 60.0;
        double res = mile / timeHour;
        System.out.println(res);
    }
}
