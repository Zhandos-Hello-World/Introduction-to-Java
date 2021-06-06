/*
(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.


Here are the sample runs:
	Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43
	Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3
	r2 is inside r1

	Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5
	Enter r2’s center x-, y-coordinates, width, and height: 3 4 4.5 5
	r2 overlaps r1

	Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 3
	Enter r2’s center x-, y-coordinates, width, and height: 40 45 3 2
	r2 does not overlap r1


*/
import java.util.Scanner;

public class Exercise03_28{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		System.out.println(x1 + ", " + y1);
		System.out.println(x2 + ", " + y2);
		System.out.println("x1 right: " + (x1 + (width1 / 2)));
		System.out.println("x2 right: " + (x2 + (width2 / 2)));
		System.out.println("x1 left: " + (x1 - (width1 / 2)));
		System.out.println("x2 left: " + (x2 - (width2 / 2)));

		System.out.println("y1 up: " + (y1 + (height1 / 2)));
		System.out.println("y2 up: " + (y2 + (height2 / 2)));
		System.out.println("y1 down: " + (y1 - (height1 / 2)));
		System.out.println("y2 : " + (y2 - (height2 / 2)));

		if(x2 < (x1 - width1/2) || x2 > (x1 + (width1 / 2)) || y2 > (y1 + (height1 / 2)) || y2 < (y1 - (height1 / 2))){
			System.out.print("r2 does not overlap r1");
		}
		else if((x1 + (width1 / 2)) <= (x2 + (width2 / 2)) && (x1 - (width1 / 2)) >= (x2 - (width2 / 2)) 
			&& (y1 + (height1 / 2)) <= (y2 + (height2 / 2)) && (y1 - (height1 / 2)) >= (y2 - (height2 / 2))){
			System.out.print("r2 overlaps r1");
		}
		else if((x1 + (width1 / 2)) >= (x2 + (width2 / 2)) && (x1 - (width1 / 2)) <= (x2 - (width2 / 2)) 
			&& (y1 + (height1 / 2)) >= (y2 + (height2 / 2)) && (y1 - (height1 / 2)) <= (y2 - (height2 / 2))){
			System.out.print("r2 is inside r1");
		}

	}
}