package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = str.nextDouble();
            }
        }
        if(isMarkovMatrix(matrix)){
            System.out.print("It is a Markov matrix");
        }
        else{
            System.out.print("It is not a Markov matrix");
        }
    }
    public static boolean isMarkovMatrix(double[][] m){
        for(int i = 0; i < m.length; i++){
            double k = 0;
            for(int j = 0; j < m.length; j++){
                k += m[j][i];
            }
            int q = (int)k;
            if(q != 1){
                return false;
            }
        }
        return true;
    }
}
