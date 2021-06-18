/*
(Check whether array is sorted) An array list is required to be sorted in ascending
order. Write a method that returns true if list is sorted, using the following header:

	public static Bboolean isSorted(int[] list)

 Write a test program that prompts the user to enter a list of integers. Note the first
number in the input indicates the number of elements in the list. This number is
not part of the list.

	Enter list: 5 2 5 6 9 10
	The list is sorted 

	Enter list: 5 2 5 6 1 6
	The list is not sorted.
*/
import java.util.Scanner;
public class Exercise07_26{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int []list = new int[size];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.print("The list is " + (isSorted(list) ? "":"not ") + "sorted");
	}
	public static boolean isSorted(int[] list){
		for(int j = 1; j < list.length; j++){
			if(list[j - 1] > list[j]){
				return false;
			}
		}
		return true;
	}
}