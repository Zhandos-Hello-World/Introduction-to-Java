/*
(Row sorting) Implement the following method to sort the rows in a twodimensional array. A new array is returned and the original array is intact.

    public static double[][] sortRows(double[][] m)

 Write a test program that prompts the user to enter a 4 * 4 matrix of double
values and displays a new row-sorted matrix. Here is a sample run:

    Enter a 4−by−4 matrix row by row:
    0.15 0.875 0.375 0.225
    0.55 0.005 0.225 0.015
    0.30 0.12 0.4 0.008
    0.07 0.021 0.14 0.2

    The row−sorted array is
    0.15 0.225 0.375 0.875
    0.005 0.015 0.225 0.55
    0.008 0.12 0.30 0.4
    0.021 0.07 0.14 0.2
*/
import java.util.Scanner;
public class Exercise08_26{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4−by−4 matrix row by row: ");
        double[][]m = new double[4][4];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }
        double[][]sorted = sortRows(m);
        System.out.println("\nThe row−sorted array is");
        for(double[]values:sorted){
            for(double value:values){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
    public static double[][] sortRows(double[][] m){
        for(int i = 0; i < m.length; i++){
            boolean check = true;
            while(check){
                check = false;
                for(int j = 1; j < m[i].length; j++){
                    if(m[i][j] < m[i][j - 1]){
                        double temp = m[i][j - 1];
                        m[i][j - 1] = m[i][j];
                        m[i][j] = temp;
                        check = true;
                    }
                }
            }
        }
        return m;
    }
}