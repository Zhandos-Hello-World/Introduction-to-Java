package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static double[][] Input(int d){
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        double [][]arr = new double[3][3];
        System.out.print("Enter matrix" + d + ": ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = str.nextDouble();
            }
        }
        return arr;
    }
    public static void Output(double[][]arr1, double [][]arr2, double [][]res){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            if(i == 1){
                System.out.print("  +  ");
            }
            else{
                System.out.print("     ");
            }
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }

            if(i == 1){
                System.out.print("  =  ");
            }
            else{
                System.out.print("     ");
            }
            for(int j = 0; j < res[i].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][]Result = new double[3][3];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                Result[i][j] = a[i][j] + b[i][j];
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        double [][]a = Input(1);
        double [][]b = Input(2);
        System.out.println("The matrices are added as follows ");
        double [][]Answer = addMatrix(a, b);
        Output(a, b, Answer);

    }
}
