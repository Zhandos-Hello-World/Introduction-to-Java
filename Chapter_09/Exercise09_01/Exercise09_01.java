/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. 
Write a test program that creates two Rectangle objects—one with width 4 and height 40, 
and the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.
*/

public class Exercise09_01{
	public static void main(String[]args){
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("Width: " + rectangle1.getWidth());
		System.out.println("Height: " + rectangle1.getHeight());
		System.out.println("Area: " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter() + "\n");

		System.out.println("Width: " + rectangle2.getWidth());
		System.out.println("Height: " + rectangle2.getHeight());
		System.out.println("Area: " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter() + "\n");
	}
}