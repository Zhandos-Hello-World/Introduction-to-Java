package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter a, b, c: ");
        float a = str.nextFloat();
        float b = str.nextFloat();
        float c = str.nextFloat();
        float d = ((float)Math.pow(b, 2)) - (4 * a * c);
        if(d == 0){
            float x = (-b)/(2*a);
            System.out.println("The equation has one root " + x);
        }
        else if(d > 0){
            float x_1 = ((-b) + (float) Math.sqrt(d))/(2 * a);
            float x_2 = ((-b) - (float) Math.sqrt(d))/(2 * a);
            System.out.println("The equation has two roots " + x_1 + " and " + x_2);
        }
        else{
            System.out.println("The equation has no real roots");
        }

    }
}
