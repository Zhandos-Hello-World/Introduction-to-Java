/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
Area = 3 * (3 ^ (1/2)) * (s ^ 2) / 2

where s is the length of a side. Here is a sample run:

	Enter the length of the side: 5.5
	The area of the hexagon is 78.5918

*/

import java.util.Scanner;
public class Exercise02_16{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the side: ");
		double s = input.nextDouble();
		double area = (int)((3 * Math.pow(3, 0.5) * Math.pow(s, 2)) / 2 * 10000) / 10000.0;
		System.out.print("The area of the hexagon is " + area);
	}
}