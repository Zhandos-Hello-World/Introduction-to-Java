package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        int cent = (int)amount % 100;
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + cent + " cents");
 }
 }
