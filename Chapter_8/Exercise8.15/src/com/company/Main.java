package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for(int i = 0; i < points.length; i++){
            points[i][0] = str.nextDouble();
            points[i][1] = str.nextDouble();
        }
        if(sameLine(points)){
            System.out.print("The five points are on the same line");
        }
        else{
            System.out.print("The five points are not on the same line");
        }
    }
    public static boolean sameLine(double[][] points){
        //double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    }
}
