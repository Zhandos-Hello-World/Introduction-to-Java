/*
(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
The intersecting point of the two lines can be found by solving the following linear
equations:
 	(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y
	(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
If the equation has no solutions, the two lines are parallel (see Figure 3.8c).

Write a program that prompts the user to enter four points and displays the intersecting point. 
Here are sample runs:

	Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
	The intersecting point is at (2.88889, 1.1111)


	Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
	The two lines are parallel
*/
import java.util.Scanner;

public class Exercise03_25{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double dy12 = y1 - y2;
		double dx12 = x1 - x2;

		double dy34 = y3 - y4;
		double dx34 = x3 - x4;
		 
	}
}