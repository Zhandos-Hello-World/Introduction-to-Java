/*
(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
 1 mile = 1.6 kilometers
 Here is a sample run: 

 Enter miles: 96
96 miles is 153.6 kilometers

*/
import java.util.Scanner;
public class Exercise02_01{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter miles: ");
		double milles = input.nextDouble();
		double km = (int)(milles * 1.6 * 10) / 10.0;
		System.out.print(milles + " miles is " + km + " kilometers");
	}
}