package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter a point with two coordinates: ");
        double x = str.nextDouble();
        double y = str.nextDouble();
        if(x >= - 5 && x <= 5 && y >= -2.5 && y <= 2.5){
            System.out.print("Point ("+ x + "," + y + ") is in the rectangle");
        }
        else{
            System.out.print("Point ("+ x + "," + y + ") is not in the rectangle");
        }
    }
}
