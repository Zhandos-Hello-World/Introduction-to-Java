package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter investment amount: ");
        double investmentAmount = str.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = str.nextDouble() / 1200;
        System.out.print("Enter number of years: ");
        double numberOfYears = str.nextDouble();
        double res = investmentAmount * (Math.pow((1 + monthlyInterestRate), numberOfYears * 12));
        System.out.print("Accumulated value is $");
        res *= 100;
        res = Math.round(res);
        res /= 100;
        System.out.print(res);
    }
}
