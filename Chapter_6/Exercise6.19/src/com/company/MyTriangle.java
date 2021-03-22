package com.company;
import java.util.Scanner;
import java.util.Locale;
public class MyTriangle{
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
        double side1 = side(x1, x2, y1, y2);
        double side2 = side(x3, x2, y3, y2);
        double side3 = side(x3, x1, y3, y1);
        if(isValid(side1, side2, side3)){
            System.out.printf("The area of the triangle is %.1f", area(side1, side2, side3));
        }
        else{
            System.out.println("Input is invalid");
        }
    }
    public static boolean isValid(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
    public static double area(double side, double side2, double side3){
        double s = (side + side2 + side3) / 2;
        return Math.sqrt(s * (s - side) * (s - side2) * (s- side3));
    }
    public static double side(double x, double x_2, double y, double y_2){
        return Math.sqrt(Math.pow((x_2 - x), 2) + Math.pow((y_2 - y), 2));
    }
}
