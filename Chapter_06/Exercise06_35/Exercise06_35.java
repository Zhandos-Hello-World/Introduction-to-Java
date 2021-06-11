/*
(Geometry: area of a pentagon) The area of a pentagon can be computed using
the following formula:

    area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5))

Write a method that returns the area of a pentagon using the following header:

    public static double area(double side)

Write a main method that prompts the user to enter the side of a pentagon and
displays its area. Here is a sample run:
    
    Enter the side: 5.5
    The area of the pentagon is 52.04444136781625
*/
import java.util.Scanner;
public class Exercise06_35 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = str.nextDouble();
        System.out.print("The area of the pentagon is " + area(side));
    }
    public static double area(double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
