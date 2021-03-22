package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t = str.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = str.nextDouble();
        if(v >= 2 && t > -58 && t < 41){
            double v1 = Math.pow(v, 0.16);
            double res = 35.74 + 0.6215 * t - 35.75 * v1 + 0.4275 * t * v1;
            System.out.print("The wind chill index is " + res);
        }
        else if(v < 2){
            System.out.print("Wind speed does not match the condition");
        }
        else{
            System.out.print("temperature does not meet the condition");
        }
    }
}
