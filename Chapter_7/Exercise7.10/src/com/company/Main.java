package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter ten numbers: ");
        int l = 10;
        double []arr = new double[l];
        for(int i = 0; i < l; i++){
            arr[i] = str.nextDouble();
        }
        System.out.print("Result is: " + indexOfSmallestElement(arr));
    }
    public static int indexOfSmallestElement(double[] array){
        double number = array[array.length - 1];
        int num = 0;
        for(int i = array.length - 1; i >= 0; i--){
            if(number > array[i]){
                number = array[i];
                num = i;
            }
        }
        return num;
    }
}
