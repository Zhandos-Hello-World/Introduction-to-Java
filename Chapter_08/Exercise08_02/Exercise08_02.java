/*
(Average the major diagonal in a matrix) Write a method that averages all the
numbers in the major diagonal in an n * n matrix of double values using the
following header:

    public static double averageMajorDiagonal(double[][] m)

 Write a test program that reads a 4-by-4 matrix and displays the average of all its
elements on the major diagonal. Here is a sample run:

    Enter a 4−by−4 matrix row by row:
    1 2 3 4.0
    5 6.5 7 8
    9 10 11 12
    13 14 15 16
    Average of the elements in the major diagonal is 8.625
*/
import java.util.Scanner;
public class Exercise08_02{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double [][]arr = new double[4][4];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str.nextDouble();
            }
        }

        System.out.print("Average of the elements in the major diagonal is "+ averageMajorDiagonal(arr));
    }
    public static double averageMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0, j = 0; i < m.length; i++, j++){
            sum += m[i][j];
        }
        return sum / 4.0;
    }
}
