/*
(Pattern recognition: four consecutive equal numbers) Write the following
method that tests whether a two-dimensional array has four consecutive numbers
of the same value, either horizontally, vertically, or diagonally:

    public static boolean isConsecutiveFour(int[][] values)
    
Write a test program that prompts the user to enter the number of rows and
columns of a two-dimensional array then the values in the array, and displays true
if the array contains four consecutive numbers with the same value. Otherwise,
the program displays false. Here are some examples of the true cases:

*/
import java.util.Scanner;
public class Exercise08_19{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]values = new int[6][7];
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values[i].length; j++){
                values[i][j] = input.nextInt();
            }
        }
        System.out.print(isConsecutiveFour(values));
    }
    public static boolean isConsecutiveFour(int[][] values){
        //horizontal and vertical
        for (int[] value : values) {
            int num = value[0];
            int count = 0;
            for (int i : value) {
                if (num == i) {
                    count++;
                } else {
                    count = 1;
                    num = i;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        for(int i = 0; i < values[0].length; i++){
            int num = values[0][i];
            int count = 0;
            for(int j = 0; j < values.length; j++){
                if(num == values[j][i]){
                    count++;
                }
                else{
                    count = 1;
                    num = values[j][i];
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        //major diagonal
        for(int k = values.length - 1; k >= 0; k--){
            int count = 0;
            int num = values[k][0];
            for(int i = k, j = 0; i < values.length && j < values[0].length; i++, j++){
                if(num == values[i][j]){
                    count++;
                }
                else{
                    num = values[i][j];
                    count = 1;
                }

                if(count == 4){
                    return true;
                }
            }
        }
        for(int k = 1; k < values[0].length; k++){
            int count = 0;
            int num = values[0][k];
            for(int i = 0, j = k; i < values.length && j < values[0].length; i++, j++){
                if(num == values[i][j]){
                    count++;
                }
                else{
                    num = values[i][j];
                    count = 1;
                }

                if(count == 4){
                    return true;
                }
            }
        }
        //end of the major diagonal


        //sub-diagonal
        for(int k = 0; k < values.length; k++){
            int count = 0;
            int num = values[k][0];
            for(int i = k, j = 0; i >= 0 && j < values[0].length; i--, j++){
                if(num == values[i][j]){
                    count++;
                }
                else{
                    num = values[i][j];
                    count = 1;
                }

                if(count == 4){
                    return true;
                }
            }
        }
        for(int k = 1; k < values[0].length; k++){
            int count = 0;
            int num = values[k][0];
            for(int i = values.length - 1, j = k; i >= 0 && j < values[0].length; i--, j++){
                if(num == values[i][j]){
                    count++;
                }
                else{
                    num = values[i][j];
                    count = 1;
                }

                if(count == 4){
                    return true;
                }
            }
        }
        //end of the sub_diagonal
        return false;
     }
}