package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        int l = 10;
        double []arr = new double[l];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < l; i++){
            arr[i] = str.nextDouble();
        }
        System.out.print("The minimum number is: " + min(arr));
    }
    public static double min(double[] array){
        double number = array[0];
        for (double v : array) {
            if (number > v) {
                number = v;
            }
        }
        return number;
    }
}
