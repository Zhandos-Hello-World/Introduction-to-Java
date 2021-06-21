/*
(Markov matrix) An n * n matrix is called a positive Markov matrix if each
element is positive and the sum of the elements in each column is 1. Write the
following method to check whether a matrix is a Markov matrix:

    public static boolean isMarkovMatrix(double[][] m)

 Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and tests whether it is a Markov matrix. Here are sample runs:
*/
import java.util.Scanner;
public class Exercise08_25{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3−by−3 matrix row by row: ");
        double[][]matrix = new double[3][3];
        for(double []values:matrix){
            for(int j = 0; j < values.length; j++){
                values[j] = input.nextDouble();
            }
        }
        System.out.print("It is" + (isMarkovMatrix(matrix) ? " ": " not ") + "a Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] m){
        for(int i = 0; i < m.length; i++){
            double sum = 0;
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] < 0){
                    return false;
                }
                sum += m[j][i];
            }
            if(sum != 1.0){
                return false;
            }
        }
        return true;
    }
}