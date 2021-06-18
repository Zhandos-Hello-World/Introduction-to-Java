/*
(Computing lcm) Write a method that returns the lcm (least common multiple) of
an unspecified number of integers. The method header is specified as follows:

	public static int lcm(int... numbers)

 Write a test program that prompts the user to enter five numbers, invokes the
method to find the lcm of these numbers, and displays the lcm.
*/

public class Exercise07_14{
	public static void main(String[]args){
		System.out.print(lcm(15, 20, 30, 45, 90));
	}
	public static int lcm(int... numbers){
		int min = numbers[0];
		for(int value:numbers){
			if(value < min){
				min = value;
			}
		}


		for(int i = min; i > 1; i--){
			boolean checkDivide = true;
			for(int value:numbers){
				if(value % i != 0){
					checkDivide = false;
					break;
				}
			}
			if(checkDivide){
				min = i;
			}
		}
		return min;

	}
}