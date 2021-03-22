package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    str.useLocale(Locale.US);
	    System.out.print("Enter the length from the center to a vertex: ");
	    double r = str.nextDouble();
	    if(r >= 0){
			double s = 2.0 * r * Math.sin(Math.PI/5.0);
			double Area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5.0));
			System.out.println("The area of the pentagon is " + Area);
		}
    }
}
