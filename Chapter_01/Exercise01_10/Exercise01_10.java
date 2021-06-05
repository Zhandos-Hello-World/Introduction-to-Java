/*
(Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
and 30 seconds. Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)
*/
public class Exercise01_10{
	public static void main(String[]args){
		System.out.println(15 / (50.3) * 60 + "km/h");
		System.out.println((15 / 1.6) / (50.3) * 60 + "mile/h");
	}
}