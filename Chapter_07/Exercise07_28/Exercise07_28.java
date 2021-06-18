/*
(Math: permutations) Write a program that prompts the user to enter four integers
and then displays all possible ways of arranging the four integers.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Exercise07_28{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 4 numbers: ");
		int[]list = new int[4];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		permutations(list, 0);
	}

    private static void permutations(int[] array, int pos){
        if(pos >= array.length - 1){
            System.out.print("[");
            for(int i = 0; i < array.length - 1; i++){
                System.out.print(array[i] + ", ");
            }
            if(array.length > 0)
                System.out.print(array[array.length - 1]);
            System.out.println("]");
            return;
        }

        for(int i = pos; i < array.length; i++){

            int t = array[pos];
            array[pos] = array[i];
            array[i] = t;

            permutations(array, pos+1);

            t = array[pos];
            array[pos] = array[i];
            array[i] = t;
        }
    }


}