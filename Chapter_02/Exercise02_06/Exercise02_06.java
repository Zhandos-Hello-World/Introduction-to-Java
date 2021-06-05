/*
(Multiply the digits in an integer) Write a program that reads an integer between
0 and 1000 and multiplies all the digits in the integer. For example, if an integer
is 932, the multiplication of all its digits is 54.
 Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:

Enter a number between 0 and 1000: 999
The multiplication of all digits in 999 is 729


*/
import java.util.Scanner;

public class Exercise02_06{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int num1 = number % 10;
		int num2 = ((number / 10 % 10) == 0) ? 1 : (number / 10 % 10);
		int num3 = ((number / 100) == 0) ? 1 : (number / 100);
		int result = num1 * num2 * num3;
		System.out.print("The multiplication of all digits in " + number + " is " + result);
	}
}