/*
(Compute the perimeter of a triangle) Write a program that reads three edges for a
triangle and computes the perimeter if the input is valid. Otherwise, display that the
input is invalid. The input is valid if the sum of every pair of two edges is greater
than the remaining edge.

*/

import java.util.Scanner;

public class Exercise03_19{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 side of the trinagle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if(side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1){
			System.out.print("The input is invalid");
		}
		else{
			double p = side1 + side2 + side3;
			System.out.print("Perimeter: " + p);
		}
	}
}