package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
		str.useLocale(Locale.US);
	    System.out.print("Enter the radius and length of a cylinder: ");
	    float radius = str.nextFloat();
	    float length = str.nextFloat();
	    double area = 3.14 * radius * radius;
	    double volume = area * length;
	    System.out.println("The area is " + area);
	    System.out.println("The volume is " + volume);
    }
}
