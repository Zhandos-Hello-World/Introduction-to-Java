/*
(Algebra: solve linear equations) Write a method that solves the following 2 * 2
system of linear equations:
a00x + a01y = b0
a10x + a11y = b1
x = b0a11 - b1a01
a00a11 - a01a10
y = b1a00 - b0a10
a00a11 - a01a10
 The method header is:
    
    public static double[] linearEquation(double[][] a, double[] b)
 
 The method returns null if a00a11 - a01a10 is 0. Write a test program that
prompts the user to enter a00, a01, a10, a11, b0, and b1 and displays the result. If
a00a11 - a01a10 is 0, report that "The equation has no solution." A sample run is
similar to Programming Exercise 3.3.
*/
import java.util.Scanner;
public class Exercise08_30{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double[][]a = new double[2][2];
        double[]b = new double[2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                a[i][j] = input.nextDouble();
            }
        }
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();

        if(linearEquation(a,b) == null){
            System.out.println("The equation has no solution.");
        }
        else{
            double[]xy = linearEquation(a, b);
            System.out.print("x is " + xy[0] + " and y is " + xy[1]);
        }

    }
    public static double[] linearEquation(double[][] a, double[] b){
        if((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0){
            return null;
        }
        double[]answer = new double[2];
        answer[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        answer[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        return answer;
    }
}
