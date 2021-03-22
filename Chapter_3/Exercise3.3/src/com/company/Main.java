package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = str.nextDouble();
        double b = str.nextDouble();
        double c = str.nextDouble();
        double d = str.nextDouble();
        double e = str.nextDouble();
        double f = str.nextDouble();
        double det = (a * d) - (b * c);
        if(det == 0){
            System.out.println("The equation has no solution ");
        }
        else{
            double detX = (e * d) - (f * b);
            double detY = (a * f) - (e * c);
            double x = detX / det;
            double y = detY / det;
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
