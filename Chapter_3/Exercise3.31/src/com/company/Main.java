package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeDollars = str.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int a = str.nextInt();
        if(a >= 0 && a <= 1){
            System.out.print("Enter the dollar amount: ");
            double a_1 = str.nextDouble();
            if(a == 0){
                double res = exchangeDollars * a_1;
                System.out.println("$" + a_1 + "  is " + res + " yuan");
            }
            else{
                double res = a_1 / exchangeDollars;
                System.out.println(a_1 + " yuan is $" + res);
            }
        }
        else{
            System.out.println("Incorrect input");
        }
    }
}
