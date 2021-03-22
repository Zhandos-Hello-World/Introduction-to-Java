package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter weight in pounds: ");
        double weight = str.nextDouble() * 0.453592;
        System.out.print("Enter height in inches: ");
        double height = str.nextDouble() * 0.0254;
        double bmi = weight / (height * height);
        System.out.print("BMI is " + bmi);
    }
}
