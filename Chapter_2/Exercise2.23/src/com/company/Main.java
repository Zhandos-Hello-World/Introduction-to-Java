package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the driving distance: ");
        double distance = str.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = str.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = str.nextDouble();
        double calc = price * (distance / miles);
        System.out.print("The cost of driving is $" + calc);
    }
}
