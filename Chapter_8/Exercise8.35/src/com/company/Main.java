package com.company;
import java.util.Scanner;
public class Main {

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
