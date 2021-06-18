/*
(Random number selector) Write a method that returns a random number from a
list of numbers passed in the argument. The method header is specified as follows:

	public static int getRandom(int... numbers)

*/

public class Exercise07_13{
	public static void main(String[]args){
		System.out.print(getRandom(2, 3, 4, 5, 10, 24, 34, 32));
	}
	public static int getRandom(int... numbers){
		return numbers[(int)(Math.random() * numbers.length + 0)];
	}
}