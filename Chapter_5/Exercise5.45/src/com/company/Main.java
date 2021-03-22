package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter ten numbers: ");
        double mean = 0, mean_2 = 0;
        for(int i = 1; i <= 10; i++){
            double n_numbers = str.nextDouble();
            mean += n_numbers;
            mean_2 += Math.pow(n_numbers, 2);
        }
        double deviation = Math.sqrt((mean_2 - (Math.pow(mean, 2) / 10.0)) /(10.0 - 1.0));
        mean /= 10.0;
        System.out.println("The mean is " + mean);
        deviation *= 100000;
        deviation = Math.round(deviation);
        deviation /= 100000;
        System.out.println("The standard deviation is " + deviation);

    }
}
