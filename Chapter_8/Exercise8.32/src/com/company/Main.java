package com.company;
import java.util.Scanner;
import java.util.Locale;
import static java.lang.Double.NaN;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double [][]points = new double[3][2];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = str.nextDouble();
            }
        }
        if(Double.isNaN(getTriangleArea(points))){
            System.out.println("The three points are on the same line");
        }
        else{
            System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
        }
    }
    public static double getTriangleArea(double[][] points){
        double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
        double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);
        double side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
