/*
(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
cell was flipped. Your program should prompt the user to enter a 6-by-6 array
with 0s and 1s and find the first row r and first column c where the even number
of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
is at (r, c). Here is a sample run:

    Enter a 6−by−6 matrix row by row:
    1 1 1 0 1 1
    1 1 1 1 0 0
    0 1 0 1 1 1
    1 1 1 1 1 1
    0 1 1 1 1 0
    1 0 0 0 0 1
    The flipped cell is at (0, 1)
*/
import java.util.Scanner;

public class Exercise08_23 {

    public static void main(String[] args) {
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][]arr = input();
        findError(arr);

    }
    public static void findError(int[][]arr){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum % 2 != 0){
                for(int j = 0; j < arr.length; j++){
                    sum = 0;
                    for(int l = 0; l < arr[j].length; l++){
                        sum += arr[l][j]; 
                    }
                    if(sum % 2 != 0){
                        System.out.println("The flipped cell is at (" + i + ", " + j + ")");
                    }
                }
            }
        }
    }




    public static int[][]input(){
        Scanner input = new Scanner(System.in);
        int[][]arr = new int[6][6];
        for(int[]values:arr){
            for(int i = 0; i < values.length; i++){
                values[i] = input.nextInt();
            }
        }
        return arr;
    }
}
