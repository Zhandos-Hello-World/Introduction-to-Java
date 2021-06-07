/*
(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):

    Area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180.0 / 6)))

Write a program that prompts the user to enter the side of a hexagon and displays
its area. Here is a sample run:

Enter the side: 5.5
The area of the hexagon is 78.59

*/


import java.util.Scanner;
public class Exercise04_04 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        
        System.out.print("Enter the side: ");
        double s = str.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180.0 / 6)));
        System.out.printf("The area of the hexagon is %1.2f", area);
    }
}
