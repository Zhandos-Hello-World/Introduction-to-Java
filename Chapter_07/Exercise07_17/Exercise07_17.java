/*
(Sort students) Write a program that prompts the user to enter the number of students, the students’ names, 
and their scores and prints student names in decreasing order of their scores. Assume the name is a string 
without spaces, use the Scanner’s next() method to read a name.	
*/
import java.util.Scanner;

public class Exercise07_17{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Number of students: ");
		int size = input.nextInt();
		int[]scores = new int[size];
		String[]students = new String[size];
		for(int i = 0; i < size; i++){
			System.out.print("The student's name: ");
			students[i] = input.next();
			System.out.print("The student's score: ");	
			scores[i] = input.nextInt();
		}

		System.out.println();

		//sorting
		for(int i = 0; i < size - 1; i++){
			int currentMin = scores[i];
			int currentMinIndex = i;
			String currentMinStr = students[i];

			for(int j = i + 1; j < size; j++){
				if(currentMin > scores[j]){
					currentMin = scores[j];
					currentMinIndex = j;

					currentMinStr = students[j];
				}
			}
			if(currentMinIndex != i){
				scores[currentMinIndex] = scores[i];
				scores[i] = currentMin;

				students[currentMinIndex] = students[i];
				students[i] = currentMinStr;
			}
		}
		//output
		for(int i = size - 1; i >= 0; i--){
			System.out.println("Name: " + students[i] + " scores: " + scores[i]);
		}


	}
}