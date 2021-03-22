package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter v0, v1, and t: ");
        double v_0 = str.nextDouble();
        double v_1 = str.nextDouble();
        double t = str.nextDouble();
        double res = (v_1 - v_0) / t;
        System.out.print("The average acceleration is " + res);
    }
}
