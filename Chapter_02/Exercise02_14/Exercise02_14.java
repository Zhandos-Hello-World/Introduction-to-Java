/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a
sample run:

Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573


*/


import java.util.Scanner;
public class Exercise02_14{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble() * 0.45359237;
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble() * 0.0254;
		double bmi = (int)(Math.round(weight / Math.pow(height, 2) * 10000)) / 10000.0;
		System.out.print("BMI is " + bmi);
	}
}