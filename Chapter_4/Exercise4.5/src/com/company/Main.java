package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of sides: ");
        double ns = str.nextDouble();
        System.out.print("Enter the side: ");
        double s = str.nextDouble();
        double area = (ns * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180.0 / ns)));
        System.out.print("The area of the polygon is " + area);
    }
}
