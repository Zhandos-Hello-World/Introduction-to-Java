/*
(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter 10 numbers, invokes the method to reverse the numbers, and displays the
numbers.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Exercise07_12{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[]x = new double[10];
		for(int i = 0; i < x.length; i++){
			x[i] = input.nextDouble();
		}
		System.out.print("The array is reserved: " + Arrays.toString(reverse(x)));
	}
	public static double[] reverse(double[]array){
		for(int i = 0, j = array.length - 1; i < array.length / 2; i++, j--){
			double temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		return array;
	}
}