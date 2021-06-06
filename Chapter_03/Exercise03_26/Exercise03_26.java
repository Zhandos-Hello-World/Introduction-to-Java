/*
(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 4 and 5, whether it is divisible
by 4 or 5, and whether it is divisible by 4 or 5 but not both. Here is a sample run of
this program:

	Enter an integer: 10
	Is 10 divisible by 4 and 5? false
	Is 10 divisible by 4 or 5? true
	Is 10 divisible by 4 or 5 but not both? true

*/
import java.util.Scanner;
public class Exercise03_26{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.println("Is 10 divisible by 4 and 5? " + (num % 4 == 0 && num % 5 == 0));
		System.out.println("Is 10 divisible by 4 or 5? " + (num % 4 == 0 || num % 5 == 0));
		System.out.println("Is 10 divisible by 4 or 5 but not both? " + (num % 4 == 0 ^ num % 5 == 0));
	}
}