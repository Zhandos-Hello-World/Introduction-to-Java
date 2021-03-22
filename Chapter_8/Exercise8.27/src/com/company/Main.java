package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = new double[3][3];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = str.nextDouble();
            }
        }
        System.out.println("The column-sorted array is ");
        m = sortColumns(m);
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortColumns(double[][] m){
        double []arr = new double[m[0].length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                arr[j] = m[j][i];
            }
            Arrays.sort(arr);
            for(int j = 0; j < m[i].length; j++){
                m[j][i] = arr[j];
            }
        }
        return m;
    }
}
