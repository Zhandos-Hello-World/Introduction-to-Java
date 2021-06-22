/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0. The class contains:
■■ Private data fields a, b, and c that represent three coefficients.
■■ A constructor with the arguments for a, b, and c.
■■ Three getter methods for a, b, and c.
■■ A method named getDiscriminant() that returns the discriminant, which
is b2 - 4ac.
■■ The methods named getRoot1() and getRoot2() for returning two roots
of the equation


These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.

Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display "The equation has
no roots." See Programming Exercise 3.1 for sample runs.
*/
import java.util.Scanner;
public class Exercise09_10{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		if(q.getDiscriminant() >= 0){
			System.out.print("The equation has" + 
				((q.getDiscriminant() == 0) ? " one root " + q.getRoot1():" two roots " + q.getRoot1() + " and " + q.getRoot2()));
		}
		else{
			System.out.print("The equation has no roots");
		}
	}
}