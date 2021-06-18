/*
(Algebra: solve quadratic equations) Write a method for solving
 a quadratic equation using the following header:

	public static int solveQuadratic(double[] eqn, double[] roots)

The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
eqn and the real roots are stored in roots. The method returns the number of real
roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
Write a program that prompts the user to enter values for a, b, and c and displays
the number of real roots and all real roots.
*/
import java.util.Scanner;
public class Exercise07_25{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double []roots = new double[2];
		double []eqn = new double[3];
		System.out.print("Enter a, b, c: ");
		for(int i = 0; i < eqn.length; i++)
			eqn[i] = input.nextDouble();

		System.out.print("This equation has " + ((solveQuadratic(eqn, roots) == 2) ? "two roots " + roots[0] + " and " + roots[1] :
			(solveQuadratic(eqn, roots) == 1) ? "one root " + roots[0] : "no real roots"));
	}
	public static int solveQuadratic(double[] eqn, double[] roots){
		double a = eqn[0], b = eqn[1], c = eqn[2];
		double d = Math.pow(b, 2) - (4 * a * c);
		if(d > 0){
			roots[0] = (-b + Math.sqrt(d)) / (2 * a);
			roots[1] = (-b - Math.sqrt(d)) / (2 * a);
			return 2;
		}
		else if(d == 0){
			roots[0] = (-b) / (2 * a);
			roots[1] = (-b) / (2 * a);
			return 1;
		}	
		return 0;
	}
}