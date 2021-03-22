package com.company;
public class Main {
    public static void main(String[] args) {
        int now = 312032486;
        int days = 365;
        int secondsPlus = (days* 24 * 60 * 60) / 7;
        int secondsPlus_2 = (days * 24 * 60 * 60) / 45;
        int secondsMinus = (days * 24 * 60 * 60) / 13;
        int resAdd = 5 * (secondsPlus_2 + secondsPlus - secondsMinus);
        System.out.println(now+ resAdd);
    }
}
