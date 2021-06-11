/*
(Geometry: point position)  Programming Exercise 3.32 shows how to test
whether a point is on the left side of a directed line, on the right, or on the same
line. Write the methods with the following headers:

    public static boolean leftOfTheLine(double x0, double y0,
     double x1, double y1, double x2, double y2)

    public static boolean onTheSameLine(double x0, double y0,
     double x1, double y1, double x2, double y2)

    public static boolean onTheLineSegment(double x0, double y0,
     double x1, double y1, double x2, double y2)

Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left side of the line from p0 to p1, right side,
the same line, or on the line segment. Here are some sample runs:
    Enter three points for p0, p1, and p2: 1 1 2 2 1.5 1.5
    (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.0, 2.0)
    
    Enter three points for p0, p1, and p2: 1 1 2 2 3 3
    (3.0, 3.0) is on the same line from (1.0, 1.0) to (2.0, 2.0)
   
    Enter three points for p0, p1, and p2: 1 1 2 2 1 1.5
    (1.0, 1.5) is on the left side of the line
     from (1.0, 1.0) to (2.0, 2.0)
   
    Enter three points for p0, p1, and p2: 1 1 2 2 1 –1
    (1.0, −1.0) is on the right side of the line
     from (1.0, 1.0) to (2.0, 2.0)
*/
import java.util.Scanner;
public class Exercise06_39{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();
        double res = (px1 - px0) * (py2 - py0) - (px2 - px0) * (py1 - py0);
        String p0 = "(" + px0 + ", " + py0 + ")";
        String p1 = "(" + px1 + ", " + py1 + ")";
        String p2 = "(" + px2 + ", " + py2 + ")";
        if(res > 0){
            if(leftOfTheLine(px0, py0, px1, py1, px2, py2)){
                System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the left side of the line from " + p1 + " to " + p0);
            }
        }
        else if(res == 0){
            if(onTheSameLine(px0, py0, px1, py1, px2, py2)){
                System.out.println(p2 + " is on the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the line from " + p1 + " to " + p0);
            }
        }
        else{
            if(leftOfTheLine(px0, py0, px1, py1, px2, py2)){
                String temp;
                temp = p0;
                p0 = p1;
                p1 = temp;
            }
            System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p1);
        }

    }
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return x0 < x1;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return x0 < x1;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        return x0 > x1;
    }    
}
