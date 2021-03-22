package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        double a = str.nextDouble();
        double res = a * 0.305;
        System.out.println(a + " feet is " + res + " meters");
    }
}
