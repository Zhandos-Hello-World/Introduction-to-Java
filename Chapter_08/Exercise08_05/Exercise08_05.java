/*
(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix.
Each element cij is aij + bij. For example, for two 2 * 2 matrices a and b, c is

Write a test program that prompts the user to enter two 2 * 2 matrices and
displays their sum. Here is a sample run:

Enter matrix1: 1 2 3 4
Enter matrix2: 0 2 4 1
The matrices are added as follows
1.0 2.0   0.0 2.0   1.0 4.0
3.0 4.0 + 4.0 1.0 = 7.0 5.0
*/
import java.util.Scanner;
public class Exercise08_05 {
    public static void main(String[]args){
        final double[][]matrix1 = new double[2][2];
        final double[][]matrix2 = new double[2][2];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        matrix1[0][0] = input.nextDouble();
        matrix1[0][1] = input.nextDouble();
        matrix1[1][0] = input.nextDouble();
        matrix1[1][1] = input.nextDouble();

        System.out.print("Enter matrix2: ");
        matrix2[0][0] = input.nextDouble();
        matrix2[0][1] = input.nextDouble();
        matrix2[1][0] = input.nextDouble();
        matrix2[1][1] = input.nextDouble();

        double [][]res = add(matrix1, matrix2);
        System.out.println("The matrices are added as follows ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < matrix1.length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            if(i == 1)
                System.out.print(" +  ");
            else
                System.out.print("    ");

            for(int j = 0; j < matrix2.length; j++){
                System.out.print(matrix2[i][j] + " ");
            }

            if(i == 1)
                System.out.print(" =  ");
            else
                System.out.print("    ");

            for(int j = 0; j < res.length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static double[][] add(double[][]matrix1, double[][]matrix2){
        double[][]matrixResult = new double[2][2];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }
}