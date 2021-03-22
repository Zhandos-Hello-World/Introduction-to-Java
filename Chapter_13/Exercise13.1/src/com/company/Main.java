package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter 3 sides: ");
        double side1 = str.nextInt();
        double side2 = str.nextInt();
        double side3 = str.nextInt();
        str.nextLine();
        System.out.print("Enter a color: ");
        String color = str.nextLine();
        System.out.print("Enter fill(true/false): ");
        boolean fill = str.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3, color, fill);
        System.out.print(triangle.toString());
    }
}
