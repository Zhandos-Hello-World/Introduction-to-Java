/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:

length = (v^2) / (2 * a)

Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s^2), then,
displays the minimum runway length. Here is a sample run:

	Enter speed and acceleration: 60 3.5
	The minimum runway length for this airplane is 514.286
*/

import java.util.Scanner;
public class Exercise02_12{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		double length = (int)(Math.round(((Math.pow(v, 2)) / (2 * a)) * 1000)) / 1000.0;
		System.out.print("The minimum runway length for this airplane is " + length);
	}
}