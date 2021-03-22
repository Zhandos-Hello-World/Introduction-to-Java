package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter employee's name: ");
        String name = str.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = str.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = str.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double rateF = str.nextDouble() * 10;
        System.out.print("Enter state tax withholding rate: ");
        double rateS = str.nextDouble() * 10;
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay rate: $" + pay);
        System.out.println("Gross pay: $" + pay * hoursWorked);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (20.0%): $" + (float)(pay * rateF));
        System.out.println("  State Withholding (9.0%): $" + (float)(pay * rateS));
        System.out.println("  Total Deduction: $" + (float)((pay * rateF) + (pay * rateS)));
        System.out.print("Net Pay: $" + (float)((pay * hoursWorked) - ((pay * rateF) + (pay * rateS))));
    }
}
