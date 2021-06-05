/*
(Convert meters into feet) Write a program that reads a number in meters, converts it to feet, and displays the result.
 One meter is 3.2786 feet. Here is a sample run:
*/

import java.util.Scanner;
public class Exercise02_03{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for meter: ");
		double meters = input.nextDouble();
		double feet = meters * 3.2786;
		System.out.print(meters + " meters is " + feet + " feet");
	}
}