/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
*/
import java.util.Scanner;

public class Exercise03_08{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();


		if(a >= b && b >= c){
			System.out.print("Number is sorted: " + c + ", " + b + ", " + a);
		}
		else if(a >= c && c >= b){
			System.out.print("Number is sorted: " + b + ", " + c + ", " + a);
		}
		else if(b >= a && a >= c){
			System.out.print("Number is sorted: " + c + ", " + a + ", " + b);
		}
		else if(b >= c && c >= a){
			System.out.print("Number is sorted: " + a + ", " + c + ", " + b);
		}
		else if(c >= a && a >= b){
			System.out.print("Number is sorted: " + b + ", " + a + ", " + c);
		}
		else if(c >= b && b >= a){
			System.out.print("Number is sorted: " + a + ", " + b + ", " + c);
		}
	}
}