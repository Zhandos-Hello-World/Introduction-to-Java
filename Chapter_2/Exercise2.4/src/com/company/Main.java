package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    str.useLocale(Locale.US);
	    System.out.print("Enter a number in pounds: ");
	    double a = str.nextDouble();
	    double res = a * 0.454;
	    System.out.println(a + " pounds is " + res + " kilograms");
    }
}
