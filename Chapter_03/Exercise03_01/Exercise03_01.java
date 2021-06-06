/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:

 	r1 = -b + √(b2 - 4ac)/2a and r2 = -b - √(b2 - 4ac)/2a

b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display "The equation
has no real roots."
Note you can use Math.pow(x, 0.5) to compute 2x. Here are some sample
runs:

	Enter a, b, c: 1.0 3 1
	The equation has two roots -0.381966 and -2.61803

	Enter a, b, c: 1 2.0 1
	The equation has one root -1.0

	Enter a, b, c: 1 2 3
	The equation has no real roots
*/
import java.util.Scanner;
public class Exercise03_01{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = Math.pow(b, 2) - (4 * a * c);
		if(d > 0){
			double r1 = (int)((-b + Math.pow(d, 0.5)) / (2 * a) * 100000) / 100000.0;
			double r2 = (int)((-b - Math.pow(d, 0.5)) / (2 * a) * 100000) / 100000.0;
			System.out.print("The equation has two roots " + r1 + " and " + r2);
		} 
		else if(d == 0){
			double r = (int)((-b) / (2 * a) * 100000) / 100000.0;
			System.out.print("The equation has one root " + r);
		}
		else{
			System.out.print("The equation has no real roots");
		}
	}
}