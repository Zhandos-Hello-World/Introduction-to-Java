package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double [][]arr = new double[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = str.nextDouble();
            }
        }
        double sum = 0.0;
        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j < 3; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of the elements at column " + i + " is " + sum);
            sum = 0;
        }
    }
}
