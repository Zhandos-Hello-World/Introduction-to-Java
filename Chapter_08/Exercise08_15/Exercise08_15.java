/*
(Geometry: same line?) Programming Exercise 6.39 gives a method for testing
whether three points are on the same line.
Write the following method to test whether all the points in the array points are
on the same line:

    public static boolean sameLine(double[][] points)
 
Write a program that prompts the user to enter five points and displays whether
they are on the same line. Here are sample runs:

    Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 −5 4
    The five points are not on the same line

    Enter five points: 1 1 2 2 3 3 4 4 5 5
    The five points are on the same line
*/
import java.util.Scanner;
public class Exercise08_15 {
    static final int X = 0;
    static final int Y = 1;

    public static void main(String[] args) {

        System.out.print("Enter 5 points: ");
        double[][] points = new double[5][2];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        if (sameLine(points)) {
            System.out.println("The five points are on the same line");
        } else {
            System.out.println("The five points are not on the same line");
        }

    }

    public static boolean sameLine(double[][] points) {
        for (int k = 0; k < points.length - 3; k++) {
            if (!onTheSameLine(points[k][X],points[k][Y],
                    points[k+1][X], points[k+1][Y],
                    points[k+2][X], points[k+2][Y])) {
                return false;
            }
        }
        return true;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
}