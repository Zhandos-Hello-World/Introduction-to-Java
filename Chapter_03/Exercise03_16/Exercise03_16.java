/*
(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centred at (0, 0) with width 50 and height 150.
*/

public class Exercise03_16{
	public static void main(String[]args){
		int x = (int)(Math.random() * 51 + 0);
		int y = (int)(Math.random() * 151 + 0);
        System.out.println("Height:" + y + "  Width:" + x);
        System.out.println("(" + x + "," + y + ")");
	}
}