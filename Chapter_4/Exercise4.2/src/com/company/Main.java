package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(str.nextDouble());
        double y1 = Math.toRadians(str.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(str.nextDouble());
        double y2 = Math.toRadians(str.nextDouble());
        double radius = 6371.01;
        double res = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        double d = radius * Math.acos(res);
        System.out.print("The distance between the two points is " + d +" km");
    }
}
