/*
(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
 multiplyMatrix(double[][] a, double[][] b)
 To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + g + ain * bnj.
For example, for two 3 * 3 matrices a and b, c is
where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j
.
 Write a test program that prompts the user to enter two 3 * 3 matrices and
displays their product. Here is a sample run:

*/
import java.util.Scanner;
public class Exercise08_06{
    public static void main(String[]args){
        System.out.print("Enter matrix1: ");
        double[][]matrix1 = input();
        System.out.print("Enter matrix2: ");
        double[][]matrix2 = input();
        System.out.println("The multiplication of the matrices is");
        double res[][] = multiply(matrix1, matrix2);

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < matrix1.length; j++)
                System.out.print(matrix1[i][j] + " ");
            if(i == 1)
                System.out.print(" *   ");
            else
                System.out.print("     ");


            for(int j = 0; j < matrix2.length; j++)
                System.out.print(matrix2[i][j] + " ");

            if(i == 1)
                System.out.print(" =   ");
            else
                System.out.print("     ");

            for(int j = 0; j < res.length; j++)
                System.out.print(res[i][j] + " ");

            System.out.println();
        }

    }
    public static double[][]multiply(double[][]matrix1, double [][]matrix2){
        double[][]res = new double[3][3];
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].length; j++){

                for(int k = 0; k < res.length; k++){
                    res[i][j] += (int)(matrix1[i][k] * matrix2[k][j] * 10) / 10.0;
                }
            }
        }
        return res;

    }


    public static double[][]input(){
        Scanner input = new Scanner(System.in);
        double [][]res = new double[3][3];
        for(int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++)
                res[i][j] = input.nextDouble();
        }
        return res;
    }
}