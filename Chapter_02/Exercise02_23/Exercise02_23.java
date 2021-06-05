/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
then displays the cost of the trip. Here is a sample run:

Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36



*/

import java.util.Scanner;
public class Exercise02_23{
	public static void main(String[]args){
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = str.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = str.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = str.nextDouble();
        double calc = price * (distance / miles);
        calc = (int)(calc * 100) / 100.0;
        System.out.print("The cost of driving is $" + calc);
    }
}