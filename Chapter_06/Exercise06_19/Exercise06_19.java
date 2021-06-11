/*
(Triangles) Implement the following two methods:
	
	public static boolean isValid(double side1, double side2, double side3)
	
	public static double area(double side1, double side2, double side3)

Write a test program that reads three sides for a triangle and uses the isValid
method to test if the input is valid and uses the area method to obtain the area.
The program displays the area if the input is valid. Otherwise, it displays that
the input is invalid. The formula for computing the area of a triangle is given in
Programming Exercise 2.19.

*/
import java.util.Scanner;

public class Exercise06_19{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side1, side2, side3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if(isValid(side1, side2, side3))
			System.out.print("The area is " + area(side1, side2, side3));
		else
			System.out.print("Input is invalid");
	}

	public static boolean isValid(double side1, double side2, double side3){
		return side1 + side2 >= side3 && side2 + side3 >= side1 && side2 + side3 >= side1;
	}

	public static double area(double side1, double side2, double side3){
		double s = (side1 + side2 + side3);
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}