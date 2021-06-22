/*
(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e  		x = (ed - bf) / (ad - bc)   y = (af - ec) / (ad - bc)
cx + dy = f

The class contains:
■ Private data fields a, b, c, d, e, and f.
■■ A constructor with the arguments for a, b, c, d, e, and f.
■■ Six getter methods for a, b, c, d, e, and f.
■■ A method named isSolvable() that returns true if ad - bc is not 0.
■■ Methods getX() and getY() that return the solution for the equation.

Draw the UML diagram for the class then implement the class. 
Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. If
ad - bc is 0, report that "The equation has no solution." See Programming Exercise 3.3 for sample runs.

*/
import java.util.Scanner;
public class Exercise09_11{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();		
		LinearEquation l = new LinearEquation(a, b, c, d, e, f);
		if(l.isSolvable()){
			System.out.print("x is " + l.getX() + " and y is " + l.getY());
		}
		else{
			System.out.print("The equation has no solution");
		}
	}
}