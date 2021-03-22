package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("Enter a degree in Celsius: ");
	    double celsius = str.nextDouble();
	    double fahrenheit = ((9.0 / 5.0)  * celsius) + 32;
	    System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
