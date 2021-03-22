package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter speed and acceleration: ");
        double v = str.nextDouble();
        double a = str.nextDouble();
        double length = (Math.pow(v, 2)) / (2 * a);
        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
