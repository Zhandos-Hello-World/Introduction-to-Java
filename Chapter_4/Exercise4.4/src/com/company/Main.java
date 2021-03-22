package com.company;

import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the side: ");
        double s = str.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180.0 / 6)));
        System.out.print("The area of the hexagon is " + area);
    }
}
