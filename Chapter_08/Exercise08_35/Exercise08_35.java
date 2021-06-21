/*
(Largest block) Given a square matrix with the elements 0 or 1, write a program to
find a maximum square submatrix whose elements are all 1s. Your program should
prompt the user to enter the number of rows in the matrix.
 The program then displays the location of the first element in the maximum square submatrix and the
number of rows in the submatrix. Here is a sample run:

    Enter the number of rows in the matrix: 5
    Enter the matrix row by row:
    1 0 1 0 1
    1 1 1 0 1
    1 0 1 1 1
    1 0 1 1 1
    1 0 1 1 1
    The maximum square submatrix is at (2, 2) with size 3

Your program should implement and use the following method to find the maximum square submatrix:

    public static int[] findLargestBlock(int[][] m)

 The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix.

*/
import java.util.Scanner;
public class Exercise08_35{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = str.nextInt();
        int [][] arr = new int[row][row];
        System.out.print("Enter the matrix row by row:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j ++){
                arr[i][j] = str.nextInt();
            }
        }
    }

}
