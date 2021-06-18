/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:

	public static int[] eliminateDuplicates(int[] list)
 
 Write a test program that reads in 10 integers, invokes the method, and displays
the distinct numbers separated by exactly one space. Here is a sample run of the
program:

	Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
	The distinct numbers are: 1 2 3 6 4 5
*/
import java.util.Scanner;
public class Exercise07_15{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[]list = new int[10];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.print("The distinct numbers are: " + toString(eliminateDuplicates(list)));
	}
	public static int[] eliminateDuplicates(int[] list){
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list.length; j++){
				if(list[i] == list[j] && list[j] != -1 && i != j){
					list[j] = -1;
				}
			}
		}

		int size = 0;
		for(int i = 0; i < list.length; i++)
			if(list[i] != -1) size++;

        int []newList = new int[size];
		int indexNewList = 0;
		for(int value:list){
			if(value != -1){
				newList[indexNewList] = value;
				indexNewList++;
			}
		}
		return newList;

	}

	public static String toString(int[]list){
		String result = "";
		for(int value:list){
			result += value + " ";
		}
		return result;
	}
}