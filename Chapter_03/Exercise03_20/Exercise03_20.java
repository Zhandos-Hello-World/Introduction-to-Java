/*
(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
compute the wind-chill temperature. The formula is valid for temperatures in the
range between -58°F and 41°F and wind speed greater than or equal to 2. Write
a program that prompts the user to enter a temperature and a wind speed. 
The program displays the wind-chill temperature if the input is valid; otherwise, it displays
a message indicating whether the temperature and/or wind speed is invalid.

*/
import java.util.Scanner;

public class Exercise03_20{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double t = input.nextDouble();
		System.out.print("Enter the wind speed (7 = 2) in miles per hour: ");
		double v = input.nextDouble();
		if((t >= -58 && t <= 41) && (v >= 2 && v <= 7)){
			double twc = (int)(Math.round((35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16)) * 100000)) / 100000.0;
			System.out.print("The wind chill index is " + twc);
		}
		else{
			System.out.print("The temperature and/or wind speed is invalid.");
		}
	}
}