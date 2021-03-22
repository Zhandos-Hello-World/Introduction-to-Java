package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double [][]arr = new double[4][4];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str.nextDouble();
            }
        }

        System.out.print("Sum of the elements in the major diagonal is "+ sumMajorDiagonal(arr));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        int x = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][x];
            x++;
        }
        return sum;
    }
}
