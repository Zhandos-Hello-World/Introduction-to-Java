package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        float f = str.nextFloat();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        float millsHour = str.nextFloat();
        float calc_1 = (float) (35.74 + (0.6215 * f));
        float calc_2 = (float) (35.75 * Math.pow(millsHour, 0.16));
        float calc_3 = (float) (0.4275 * f * Math.pow(millsHour, 0.16));
        float calc = calc_1 - calc_2 + calc_3;
        System.out.print("The wind chill index is " + calc);
    }
}
