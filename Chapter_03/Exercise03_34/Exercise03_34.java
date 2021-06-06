/*
(Geometry: point on line segment) Exercise 3.32 shows how to test whether a point
is on an unbounded line. Revise Exercise 3.32 to test whether a point is on a line
segment. Write a program that prompts the user to enter the three points for p0,
p1, and p2 and displays whether p2 is on the line segment from p0 to p1. Here are
some sample runs:

	Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
	(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5) 

	Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
	(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)

*/

import java.util.Scanner;
public class Exercise03_34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();
        String p0 = "(" + px0 + ", " + py0 + ")";
        String p1 = "(" + px1 + ", " + py1 + ")";
        String p2 = "(" + px2 + ", " + py2 + ")";
        if(px0 < px1){
            if(px2 > px0 && px2 < px1 && py2 > py0 && py2 < py1){
                System.out.print(p2 + " is on the line segment from " + p0 + " to " + p1);
            }
            else{
                System.out.print(p2 + " is not on the line segment from " + p0 + " to " + p1);
            }
        }

	}   
}
