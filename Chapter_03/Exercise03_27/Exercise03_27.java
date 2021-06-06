/*
(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:

	Enter a point’s x- and y-coordinates: 100.5 25.5
	The point is in the triangle

	Enter a point’s x- and y-coordinates: 100.5 50.5
	The point is not in the triangle

*/
import java.util.Scanner;

public class Exercise03_27{

	public static void main(String[]args){
		final double correctX = 200;
		final double correctY = 100;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double intersectx = (-x * (correctY * correctX)) / (-y * correctY - x * correctX);
		double intersecty = (-y * (correctY * correctX)) / (-y * correctY - x * correctX);
		
		if(x <= intersectx || y <= intersecty){
			System.out.print("The point is in the triangle");
		}
		else{
			System.out.print("The point is not in the triangle");
		}

	}
}