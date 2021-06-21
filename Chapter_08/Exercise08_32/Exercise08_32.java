/*
(Geometry: area of a triangle) Write a method that returns the area of a triangle
using the following header:

    public static double getTriangleArea(double[][] points)

 The points are stored in a 3-by-2 two-dimensional array points with points
[0][0] and points[0][1] for (x1, y1). The triangle area can be computed
using the formula in Programming Exercise 2.19. The method returns 0 if the
three points are on the same line. Write a program that prompts the user to enter
three points of a triangle and displays the triangle’s area. Here are the sample runs:

    Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 −1.0 4.0 2.0
    The area of the triangle is 2.25

    Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
    The three points are on the same line
*/
import java.util.Scanner;
import static java.lang.Double.NaN;
public class Exercise08_32{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double [][]points = new double[3][2];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = str.nextDouble();
            }
        }
        if(Double.isNaN(getTriangleArea(points))){
            System.out.println("The three points are on the same line");
        }
        else{
            System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
        }
    }
    public static double getTriangleArea(double[][] points){
        double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
        double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);
        double side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
