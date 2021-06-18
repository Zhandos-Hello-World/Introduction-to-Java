/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.

*/
import java.util.Scanner;

public class Exercise07_04{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[]arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
			if(arr[i] < 0){
				break;
			}
		}
		int average = averageFind(arr);
		int belowAverage = 0;
		int aboveAverage = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 0){
				if(arr[i] >= average){
					aboveAverage++;
				}
				else{
					belowAverage++;
				}
			}
		}
		System.out.println("Average: " + average);
		System.out.println(belowAverage + " numbers of scores less than average");
		System.out.println(aboveAverage + " number of scores more than average");

	}
	public static int averageFind(int[]arr){
		int size = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 0){
				sum += arr[i];
				size++;
			}
		}
		return sum / size;
	}
}