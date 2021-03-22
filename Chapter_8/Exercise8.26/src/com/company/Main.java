package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][]m = new double[3][3];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = str.nextDouble();
            }
        }
        System.out.println("The row-sorted array is ");
        double[][]arr = sortRows(m);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static double[][] sortRows(double[][] m){
        for(int i = 0; i < m.length; i++){
            m[i] = sortIndexM(m[i]);
        }
        return m;
    }
    public static double[] sortIndexM(double []m){
        Arrays.sort(m);
        return m;
    }
}
