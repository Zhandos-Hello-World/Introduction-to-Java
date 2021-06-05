/*
(Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using 
the following formulas:
 	area =(√3)/4 (length of sides)^2
 	volume = area * length
 	Here is a sample run: 

Enter length of the sides and height of the Equilateral
triangle: 3.5
The area is 3.89
The volume of the Triangular prism is 19.48

*/

import java.util.Scanner;
public class Exercise02_02{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the sides and height of the Equilateral");
		System.out.print("triangle: ");
		double length = input.nextDouble();
		double area = (int)(((Math.pow(3, 0.5) * Math.pow(length, 2)) / 4.0)* 100) / 100.0;
		System.out.println("The area is " + area);
		double volume = (int)(area * length * 100) / 100.0;
		System.out.println("The volume of the Triangular prism is " + volume);

	}
}