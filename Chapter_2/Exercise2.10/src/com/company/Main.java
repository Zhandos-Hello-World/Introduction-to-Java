package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = str.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = str.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = str.nextDouble();
        double res = M * (finalTemperature - initialTemperature) * 4184.0;
        System.out.print("The energy needed is " + res);
    }
}
