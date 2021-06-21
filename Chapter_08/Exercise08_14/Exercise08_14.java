/*
(Explore matrix) Write a program that prompts the user to enter the length of a
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
the program:

    Enter the size for the matrix: 4
    0111
    0000
    0100
    1111
    All 0s on row 2
    All 1s on row 4
    No same numbers on a column
    No same numbers on the major diagonal
    No same numbers on the sub−diagonal
*/
import java.util.Scanner;
public class Exercise08_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][]arr = random(size);
        for(int[]values:arr){
            for(int value:values){
                System.out.print(value);
            }
            System.out.println();
        }
        horizontal(arr);
        vertical(arr);
        System.out.println(majorDiagonal(arr) ? "All " + arr[0][0] + "s on major diagonal":"No same numbers on the major diagonal");
        System.out.println(subDiagonal(arr) ? "All " + arr[0][0] + "s on sub-diagonal":"No same numbers on the sub−diagonal");

    }

    public static int[][]random(int size){
        int[][]arr = new int[size][size];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 2 + 0);
            }
        }
        return arr;
    }
    public static void horizontal(int[][]arr){
        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i][0];
            int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                if(num == arr[i][j]){
                    count++;
                }
            }
            if(count == arr.length){
                System.out.println("All " + arr[i][0] + "s on row " + i);
                check = true;
            }
        }
        if(!check){
            System.out.println("No same numbers on a row");
        }

    }
    public static void vertical(int[][]arr){
        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            int num = arr[0][i];
            int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                if(num == arr[j][i]){
                    count++;
                }
            }
            if(count == arr.length){
                System.out.println("All " + arr[0][i] + "s on column " + i);
                check = true;
            }
        }
        if(!check){
            System.out.println("No same numbers on a column");
        }
    }
    public static boolean majorDiagonal(int[][]arr){
        int num = arr[0][0];
        for(int i = 0, j = 0; i < arr.length; i++, j++){
            if(num != arr[i][j]){
                return false;
            }
        }
        return true;
    }
    public static boolean subDiagonal(int[][]arr){
        int num = arr[0][arr.length - 1];
        for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
            if(arr[i][j] != num){
                return false;
            }
        }
        return true;
    }
}