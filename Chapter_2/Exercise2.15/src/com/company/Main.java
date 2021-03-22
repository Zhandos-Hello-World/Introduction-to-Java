package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter x1 and y1: ");
        double x1 = str.nextDouble();
        double y1 = str.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = str.nextDouble();
        double y2 = str.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double sum = Math.pow(dx, 2) + Math.pow(dy, 2);
        double res = Math.sqrt(sum);
        System.out.print("The distance between the two points is " + res);
    }
}
