package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of sides: ");
        int n = str.nextInt();
        System.out.print("Enter the side: ");
        double side = str.nextDouble();
        System.out.print("The area of the polygon is " + area(n, side));
    }
    public static double area(int n, double side){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
