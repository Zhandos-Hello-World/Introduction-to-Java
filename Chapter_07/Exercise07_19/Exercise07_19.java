/*
(Sorted?) Write the following method that returns true if the list is already sorted
in decreasing order.

	public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list.

	Enter list: 8 10 1 5 16 61 9 11 1
	The list is not sorted

	Enter list: 10 21 11 9 7 5 4 4 3 1 1
	The list is already sorted
*/

import java.util.Scanner;

public class Exercise07_19{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int []list = new int[size];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.print("The list is " + (isSorted(list) ? "already" : "not") + " sorted");
	}
	public static boolean isSorted(int[] list){
		boolean increase = true;
		boolean decrease = true;
		for(int i = 0; i < list.length; i++){
			for(int j = 1; j < list.length; j++){
				if(list[j - 1] >= list[j]){
					decrease = false;
				}
				else if(list[j - 1] <= list[j]){
					increase = false;
				}
			}
		}
		return increase ^ decrease;
	}
}