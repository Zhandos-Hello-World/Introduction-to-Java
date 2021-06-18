/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:

	public static int average(int[] array)
	public static double average(double[] array)

 Write a test program that prompts the user to enter 10 double values, invokes this
method, then displays the average value.
*/


public class Exercise07_08{
	
	public static void main(String[]args){
		double[]arrayDouble = {1.0, 5.5, 6.1, 7.9, 0.3, 5.4, 9.8, 1.6, 4.6, 7.8};
		int[]arrayInt = {1, 5, 7, 9, 3, 4, 5, 7, 2, 5};
		System.out.println("Average is: " + average(arrayDouble));
		System.out.println("Average is: " + average(arrayInt));
	}
	public static int average(int[] array){
		int sum = 0;
		for(int value:array){
			sum += value;
		}
		return sum / array.length;
	}

	public static double average(double[] array){
		double sum = 0.0;
		for(double value:array){
			sum += value;
		}
		return sum / array.length;
	}
}