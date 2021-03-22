package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Enter side1, side2, and side3: ");
        double side1 = str.nextDouble();
        double side2 = str.nextDouble();
        double side3 = str.nextDouble();

        System.out.println("Enter a color: ");
        String color = str.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = str.nextBoolean();


    }
}
