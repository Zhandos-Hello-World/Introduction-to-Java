package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the side: ");
        double s = str.nextDouble();
        double area = (3 * Math.sqrt(3.0) * Math.pow(s, 2)) / 2.0;
        System.out.print("The area of the hexagon is " + area);
    }
}
