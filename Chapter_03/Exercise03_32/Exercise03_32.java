/*

(Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is on
the left of the line, on the right, or on the same line (see Figure 3.11):

Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left of the line from p0 to p1, to the right, or on
the same line. Here are some sample runs:

	Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
	p2 is on the left side of the line

	Enter three points for p0, p1, and p2: 1 1 5 5 2 2
	p2 is on the same line

	Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
	p2 is on the right side of the line
*/
import java.util.Scanner;

public class Exercise03_32{
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
            if(px0 < px1){
                System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the left side of the line from " + p1 + " to " + p0);
            }
        }
        else if(res == 0){
            if(px0 < px1){
                System.out.println(p2 + " is on the line from " + p0 + " to " + p1);
            }
            else{
                System.out.println(p2 + " is on the line from " + p1 + " to " + p0);
            }
        }
        else{
            if(px0 > px1){
                String temp;
                temp = p0;
                p0 = p1;
                p1 = temp;
            }
            System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p1);
        }


    }
}
