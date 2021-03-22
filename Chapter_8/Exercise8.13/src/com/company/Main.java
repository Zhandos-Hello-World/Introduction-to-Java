package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = str.nextInt();
        int column = str.nextInt();
        double[][]arr = new double[row][column];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = str.nextDouble();
            }
        }
        int []arrOutput = locateLargest(arr);
        System.out.print("The location of the largest element is at (" +
                arrOutput[0] + ", "+ arrOutput[1] + ")");
    }
    public static int[] locateLargest(double[][] a){
        double numberMax = a[0][0];
        int[] arr = new int[2];
        for(int i = 1; i < a.length; i++){
            for(int j = 1; j < a[i].length; j++){
                if(numberMax < a[i][j]){
                    numberMax = a[i][j];
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
