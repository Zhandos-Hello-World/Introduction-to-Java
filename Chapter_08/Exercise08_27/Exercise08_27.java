/*
(Column sorting) Implement the following method to sort the columns in a two
dimensional array. A new array is returned and the original array is intact.

    public static double[][] sortColumns(double[][] m)

Write a test program that prompts the user to enter a 4 * 4 matrix of double
values and displays a new column-sorted matrix. Here is a sample run:
Enter a 4−by−4 matrix row by row:
0.15 0.875 0.375 0.225
0.55 0.005 0.225 0.015
0.30 0.12 0.4 0.008
0.07 0.021 0.14 0.2

The column−sorted array is
0.07 0.005 0.14 0.008
0.15 0.021 0.225 0.015
0.30 0.12 0.375 0.2
0.55 0.875 0.4 0.225
*/
import java.util.Arrays;
import java.util.Scanner;
public class Exercise08_27{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] m = new double[4][4];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = str.nextDouble();
            }
        }
        System.out.println("The column-sorted array is ");
        for(double[]values:sortColumns(m)){
            for(double value:values){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortColumns(double[][] m){
        for(int i = 0; i < m.length; i++){
            boolean check = true;
            while(check){
                check = false;
                for(int j = 1; j < m.length; j++){
                    if(m[j][i] < m[j - 1][i]){
                        double temp = m[j - 1][i];
                        m[j - 1][i] = m[j][i];
                        m[j][i] = temp;
                        check = true;
                    }
                }
            }
        }
        return m;
    }
}
