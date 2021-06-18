/*
(Pattern recognition: consecutive four equal numbers) Write the following method
that tests whether the array has four consecutive numbers with the same value:

	public static boolean isConsecutiveFour(int[] values)

 Write a test program that prompts the user to enter a series of integers and displays it if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series. Here are sample runs:

	Enter the number of values: 8
	Enter the values: 3 4 5 5 5 5 4 5
	The list has consecutive fours

	Enter the number of values: 9
	Enter the values: 3 4 5 5 6 5 5 4 5
	The list has no consecutive fours
*/
import java.util.Scanner;
public class Exercise07_30{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int size = input.nextInt();
		System.out.print("Enter the values: ");
		int[]list = new int[size];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}

		System.out.print("The list has" + (isConsecutiveFour(list) ? " ":" no ") + "consecutive fours");
	}
	public static boolean isConsecutiveFour(int[] values){
		int sameNum = 0;
		int number = values[0];
		for(int value:values){
			if(number == value){
				sameNum++;
				if(sameNum == 4)
					return true;
			}
			else{
				number = value;
				sameNum = 1;
			}
		}
		return false;
	}
}