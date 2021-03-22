package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = str.nextInt();
        int column = str.nextInt();
        System.out.println("Enter the array: ");
        double[][]a = new double[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                a[i][j] = str.nextDouble();
            }
        }
        Location.locateLargest(a);
    }
}
