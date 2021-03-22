package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Rectangle2D r1 = new Rectangle2D();
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter five points: ");
        double[][]points = new double[5][2];
        for(int i = 0; i < points.length; i++){
            points[i][0] = str.nextDouble();
            points[i][1] = str.nextDouble();
        }
    }
}
