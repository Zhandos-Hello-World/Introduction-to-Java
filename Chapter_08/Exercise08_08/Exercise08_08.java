/*
(All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to display
all closest pairs of points with the same minimum distance. Here is a sample run:

    Enter the number of points: 8
    Enter 8 points: 0 0 1 1 −1 −1 2 2 −2 −2 −3 −3 −4 −4 5 5
    The closest two points are (0.0, 0.0) and (1.0, 1.0)
    The closest two points are (0.0, 0.0) and (−1.0, −1.0)
    The closest two points are (1.0, 1.0) and (2.0, 2.0)
    The closest two points are (−1.0, −1.0) and (−2.0, −2.0)
    The closest two points are (−2.0, −2.0) and (−3.0, −3.0)
    The closest two points are (−3.0, −3.0) and (−4.0, −4.0)
    Their distance is 1.4142135623730951
*/
import java.util.Scanner;
public class Exercise08_08{
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = str.nextInt();
        System.out.print("Enter " + numberOfPoints + " points: ");
        int[][]points = new int[numberOfPoints][2];
        for(int i = 0; i < numberOfPoints; i++){
            points[i][0] = str.nextInt();
            points[i][1] = str.nextInt();
        }
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                                            points[p2][0], points[p2][1]);
        for(int i = 0; i < points.length; i++) {
           for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1],
                                            points[j][0], points[j][1]);
                if(shortestDistance > distance){
                    shortestDistance = distance;
                }
           }
        }
        int[][] arr = sortDistance(points);
        points = arr;
        for(int i = 0; i < points.length - 1; i++){
            if(shortestDistance == distance(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1])){
                System.out.println("The closest two points are ("  + points[i][0] + ", " + points[i][1] + ") and (" +
                                    points[i + 1][0] + ", " + points[i + 1][1] + ")");
            }
        }
        System.out.print("Their distance is " + shortestDistance);
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static int[][] sortDistance(int[][] points){
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < points.length; i++){
                if(points[i - 1][0] > points[i][0]){
                    int temp = points[i - 1][0];
                    int temp1 = points[i - 1][0];
                    points[i - 1][1] = points[i][1];
                    points[i - 1][0] = points[i][0];
                    points[i][0] = temp;
                    points[i][1] = temp1;
                    check = true;
                }
            }
        }
        return points;
    }
}
