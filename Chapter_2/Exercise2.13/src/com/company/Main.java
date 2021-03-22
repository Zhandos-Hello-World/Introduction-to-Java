package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("Enter the monthly saving amount: ");
	    double a = str.nextDouble();
	    double p = 1.00417;
		double a_1 = a * p;
		double a_2 = (a_1 + a) * p;
		double a_3 = (a_2 + a) * p;
		double a_4 = (a_3 + a) * p;
		double a_5 = (a_4 + a) * p;
		double a_6 = (a_5 + a) * p;
		System.out.println("After the sixth month, the account value is " + a_6);
    }
}
