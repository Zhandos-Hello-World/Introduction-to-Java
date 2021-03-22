package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter 6 points: ");
        double [][]points = new double[6][2];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = str.nextDouble();
            }
        }
        double []res = getRightmostLowestPoint(points);
        System.out.print("The rightmost lowest point is (" + res[0] + ", " + res[1] + ")");
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double [] result = new double[2];
        double minimumY = points[0][1];
        double maximumX = points[0][0];
        boolean check = false;
        for(int i = 0; i < points.length; i++){
            if(minimumY > points[i][1]){
                minimumY = points[i][1];
                maximumX = points[i][0];
            }
        }

        for(int i = 0; i < points.length; i++){
            if(minimumY == points[i][1] && maximumX < points[i][0]){
                minimumY = points[i][1];
                maximumX = points[i][0];
            }
        }
        result[0] = maximumX;
        result[1] = minimumY;
        return result;
    }
}
