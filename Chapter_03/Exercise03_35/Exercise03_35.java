/*
(Even or odd number) Write a program that prompts the user to enter an integer and
displays whether the integer is an odd number or not. Here are the sample runs:

	Enter an integer: 200
	200 is even number

	Enter an integer: 211
	211 is odd number 

*/
import java.util.Scanner;

public class Exercise03_35{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print(number + " is " + (number % 2 == 0 ? "even":"odd") + " number");
	}
}