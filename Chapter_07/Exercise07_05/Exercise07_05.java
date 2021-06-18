/*
(The number of even numbers and odd numbers) Write a program that reads ten
integers, and then display the number of even numbers and odd numbers. Assume
that the input ends with 0. Here is the sample run of the program.

	Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0
	The number of odd numbers: 8
	The number of even numbers: 7
*/
import java.util.Scanner;

public class Exercise07_05{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int odd = 0;
		int even = 0;
		while(true){
			int number = input.nextInt();
			if(number == 0){
				break;
			}
			if(number > 0){
				if(number % 2 == 0){
					even ++;
				}
				else{
					odd ++;
				}
			}
		}
		System.out.println("The number of odd numbers: " + odd);
		System.out.println("The number of even numbers: " + even);
	}
}