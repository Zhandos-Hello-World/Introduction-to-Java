/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.

*/
import java.util.Scanner;
public class Exercise02_22{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		int amount1 = (int)(amount);
		amount -= amount1;
		System.out.println("Your amount "+  (amount + amount1) + " consists of");
		System.out.println(amount1 + " dollars");
		System.out.print(amount + " cents");
	}
}