/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. Here is a sample run
of the program:

Enter the number of years: 5
The population in 5 years is 325932969


*/
import java.util.Scanner;
public class Exercise02_11{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		long years = input.nextInt();
		long population = (312032486 + (years * (((365 * 24 * 60 * 60) / 45) + ((365 * 24 * 60 * 60) / 7) - ((365 * 24 * 60 * 60) / 13))));
        System.out.println("The population in " + years + " years is " + population);

	}
}