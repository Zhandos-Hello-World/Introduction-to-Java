package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = str.nextDouble();
        double annualInterestRate = str.nextDouble();
        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
