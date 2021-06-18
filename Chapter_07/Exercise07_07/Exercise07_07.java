/*
(Count single digits) Write a program that generates 200 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
*/
import java.util.Scanner;

public class Exercise07_07{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[]counts = new int[200];
		for(int i = 0; i < counts.length; i++){
			counts[i] = (int)(Math.random() * 10);
		}

		int count = 0;
		for(int value:counts){
			count += value;
		}
		System.out.print("Count is " + count);
	}
}