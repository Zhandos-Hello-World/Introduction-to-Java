package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double[][]a = new double[2][2];
        double []b = new double[2];
        System.out.print("Enter a numbers a00, a01, a10, a11: ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = str.nextDouble();
            }
        }
        System.out.print("Enter a numbers b0, b1: ");
        b[0] = str.nextDouble();
        b[1] = str.nextDouble();
        double det = (a[0][0] * a[1][1]) - (a[1][0] * a[0][1]);
        if(det != 0.0){
            double []res = linearEquation(a, b);
            System.out.println("X is " + res[0]);
            System.out.println("X is " + res[1]);
        }
        else{
            System.out.println("null");
        }
    }
    public static double[] linearEquation(double[][] a, double[] b){
        double[]res = new double[2];
        res[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1]*a[1][0]);
        res[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1]*a[1][0]);
        return res;
    }
}
