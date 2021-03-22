package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double a = str.nextDouble();
        double rate = str.nextDouble() / 100;
        double res = a * rate;
        double res_1 = a + res;
        System.out.println("The gratuity is $" + rate + " and total is " + res_1);
    }
}
