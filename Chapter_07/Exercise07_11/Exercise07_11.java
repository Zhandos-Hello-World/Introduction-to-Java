/*
(Statistics: compute deviation) Programming Exercise 5.45 computes the standard
deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers


To compute the standard deviation with this formula, you have to store the 
individual numbers using an array, so they can be used after the mean is obtained.
Your program should contain the following methods:

	public static double deviation(double[] x)
	public static double mean(double[] x)

 Write a test program that prompts the user to enter 10 numbers and displays the
mean and standard deviation, as presented in the following sample run:

	Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
	The mean is 3.11
	The standard deviation is 1.55738

*/
import java.util.Scanner;
public class Exercise07_11{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[]x = new double[10];
		for(int i = 0; i < x.length; i++){
			x[i] = input.nextDouble();
		}
		System.out.printf("The mean is %1.2f\n", mean(x));
		System.out.printf("The standard deviation is %1.5f", deviation(x));

	}
	public static double deviation(double[] x){
		double meanNum = mean(x);
		double count = 0;
		for(int i = 0; i < x.length; i++){
			count += Math.pow(x[i] - meanNum, 2);
		}
		return Math.sqrt(count / (x.length - 1));
	}
	public static double mean(double[] x){
		double count = 0;
		for(int i = 0; i < x.length; i++){
			count += x[i];
		}
		return count / x.length; 
	}
}