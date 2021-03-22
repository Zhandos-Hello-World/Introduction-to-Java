package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter ten numbers: ");
        int l = 10;
        int []arrInteger = new int[l];
        double []arrDouble = new double[l];
        for(int i = 0; i < l; i++){
            double a = str.nextDouble();
            arrDouble[i] =  a;
            arrInteger[i] = (int)(a);
        }
        System.out.println("Double res: " + average(arrDouble));
        System.out.print("Integer res: " + average(arrInteger));
    }
    public static int average(int[] array){
        int number = 0;
        for (int value : array) {
            number += value;
        }
        return number / array.length;
    }
    public static double average(double[] array){
        double number = 0;
        for (double v : array) {
            number += v;
        }
        return number / array.length;
    }
}
