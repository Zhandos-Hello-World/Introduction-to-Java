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
        for(int i = 0; i <arr.length; i++){
            arr[i] = str.nextDouble();
        }
        System.out.println("The mean is " + mean(arr));
        System.out.print("The deviation is " + deviation(arr));
    }
    public static double deviation(double[] x){
        double mean = 0;
        for(int i = 0; i < x.length; i++){
            mean += x[i];
        }
        mean /= x.length;
        double pow = 0;
        for(int i = 0; i < x.length; i++){
            pow += Math.pow(x[i], 2);
        }
        double BeforePow = 0;
        for(int i = 0; i < x.length; i++){
            BeforePow += x[i];
        }
        BeforePow *= BeforePow;

        double res = Math.sqrt((pow - BeforePow / x.length) / (x.length - 1.0));
        return res;
    }
    public static double mean(double[] x){
        double mean = 0;
        for(int i = 0; i < x.length; i++){
            mean += x[i];
        }
        return mean / x.length;
    }

}
