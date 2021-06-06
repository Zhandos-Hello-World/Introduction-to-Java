/*
(Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates
a subtraction question. Revise the program to randomly generate a multiplication
question with two integers less than 1000.

*/
import java.util.Scanner;

public class Exercise03_10{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 1000 + 1);
		int number2 = (int)(Math.random() * 1000 + 1);


		System.out.print("What is " + number2 + " * " + number1 + "? ");
		int answer = input.nextInt();
		if(number2 * number1 == answer){
			System.out.println("You are correct!");
		}
		else{
			System.out.println("Your answer is wrong.");
			System.out.println(number2 + " * " + number1 +" should be " + (number2 * number1));

		}
	}
}