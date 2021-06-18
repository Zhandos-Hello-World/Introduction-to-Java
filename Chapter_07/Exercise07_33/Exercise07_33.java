/*
(Month name) Write a program that prompts the user to enter an integer between
1 and 12 and then displays the name of the month that corresponds to the integer
entered by the user. For example, if the user enters three, the program should
display March.
*/
import java.util.Scanner;

public class Exercise07_33{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month(1-12): ");
		int monthIndex = input.nextInt();
		String []months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.print("This month is " + months[monthIndex]);
	}
}