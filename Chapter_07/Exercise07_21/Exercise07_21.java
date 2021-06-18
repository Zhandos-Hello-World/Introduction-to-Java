/*
(Normalizing integers) Write a program that prompts the user to enter 10 integers,
and normalizes the integers to be in the range of 0 to 1 by dividing every integer
with the largest integer. Display the 10 normalized real-valued numbers.
*/

public class Exercise07_21{
	public static void main(String[]args){
		if(args.length != 10){
			System.out.print("Invalid args!!!");
			System.exit(1);
		}

		int[]list = new int[10];
		for(int i = 0; i < list.length; i++){
			list[i] = Integer.parseInt(args[i]);
		}


	}
}