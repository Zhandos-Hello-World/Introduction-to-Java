package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    str.useLocale(Locale.US);
        System.out.print("Enter three points for a triangle: ");
	    double x1 = str.nextDouble();
	    double y1 = str.nextDouble();
        double x2 = str.nextDouble();
        double y2 = str.nextDouble();
        double x3 = str.nextDouble();
        double y3 = str.nextDouble();
        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
        System.out.printf("The area of the triangle is: %.1f", area);


    }
}
