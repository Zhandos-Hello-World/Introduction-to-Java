/*
(Geometry: area of a triangle) Write a program that prompts the user to enter three
points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = √(s(s - side1)(s - side2)(s - side3))
Here is a sample run:

Enter the coordinates of three points separated by spaces
like x1 y1 x2 y2 x3 y3: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6

*/
import java.util.Scanner;

public class Exercise02_19{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of three points separated by spaces");
		System.out.print("like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double s = (side1 + side2 + side3) / 2.0;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		area = (int)(area * 10) / 10.0;
		System.out.print("The area of the triangle is " + area);
	}
}