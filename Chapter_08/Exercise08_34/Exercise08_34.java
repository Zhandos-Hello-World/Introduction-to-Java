/*
(Geometry: rightmost lowest point) In computational geometry, often you need
to find the rightmost lowest point in a set of points. Write the following method
that returns the rightmost lowest point in a set of points:

    public static double[]getRightmostLowestPoint(double[][] points)

 Write a test program that prompts the user to enter the coordinates of six points
and displays the rightmost lowest point. Here is a sample run:

Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
The rightmost lowest point is (6.5, -7.0)
*/
import java.util.Scanner;
public class Exercise08_34{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        double [][]points = new double[6][2];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = str.nextDouble();
            }
        }
        double []res = getRightmostLowestPoint(points);
        System.out.print("The rightmost lowest point is (" + res[0] + ", " + res[1] + ")");
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double [] result = new double[2];
        double minimumY = points[0][1];
        double maximumX = points[0][0];
        boolean check = false;
        for(int i = 0; i < points.length; i++){
            if(minimumY > points[i][1]){
                minimumY = points[i][1];
                maximumX = points[i][0];
            }
        }

        for(int i = 0; i < points.length; i++){
            if(minimumY == points[i][1] && maximumX < points[i][0]){
                minimumY = points[i][1];
                maximumX = points[i][0];
            }
        }
        result[0] = maximumX;
        result[1] = minimumY;
        return result;
    }
}
