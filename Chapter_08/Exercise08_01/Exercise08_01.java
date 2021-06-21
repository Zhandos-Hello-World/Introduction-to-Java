/*
(Sum elements row by row) Write a method that returns the sum of all the elements in a specified row in a matrix using the following header:
    
    public static double sumRow(double[][] m, int rowIndex)

Write a test program that reads a 3-by-4 matrix and displays the sum of each row.
Here is a sample run:

    Enter a 3−by−4 matrix row by row:
    1.5 2 3 4
    5.5 6 7 8
    9.5 1 3 1
    Sum of the elements at row 0 is 10.5
    Sum of the elements at row 1 is 26.5
    Sum of the elements at row 2 is 14.5
*/
import java.util.Scanner;
public class Exercise08_01{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double [][]arr = new double[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = str.nextDouble();
            }
        }
        double sum = 0.0;
        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j < 3; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of the elements at column " + i + " is " + sum);
            sum = 0;
        }
    }
}
