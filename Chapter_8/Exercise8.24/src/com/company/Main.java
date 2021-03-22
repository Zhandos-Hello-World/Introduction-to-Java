package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[][]gird = readASolution();
    }
    public static int[][] readASolution(){
        Scanner str =  new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][]grid = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                grid[i][j] = str.nextInt();
            }
        }
        return grid;
    }
}
