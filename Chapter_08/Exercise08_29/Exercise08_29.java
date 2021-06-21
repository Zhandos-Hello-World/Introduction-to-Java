/*
(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
have the same contents. Write a method that returns true if m1 and m2 are identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are identical. Here are the sample runs:

    Enter list1: 51 25 22 6 1 4 24 54 6
    Enter list2: 51 22 25 6 1 4 24 54 6
    The two arrays are identical


    Enter list1: 51 5 22 6 1 4 24 54 6
    Enter list2: 51 22 25 6 1 4 24 54 6
    The two arrays are not identical
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_29{

    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int [][]arr1 = input();
        System.out.print("Enter list2: ");
        int [][]arr2 = input();
        System.out.print("The two arrays are" + (equals(arr1, arr2) ? " ":" not ") +"strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2){
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                if(m1[i][j] != m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] input(){
        Scanner input = new Scanner(System.in);
        int[][]arr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}

