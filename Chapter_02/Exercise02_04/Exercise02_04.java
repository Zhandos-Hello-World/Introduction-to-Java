/*
(Convert square meter into ping) Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.
Here is a sample run:

Enter a value for meter: 10
10.0 meters is 32.786 feet
*/

import java.util.Scanner;
public class Exercise02_04{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();
		double pings = squareMeters * 0.3025;
		System.out.print(squareMeters + " square meters is " + pings + " pings"); 
	}
}