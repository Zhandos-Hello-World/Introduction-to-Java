/*
(Check Sudoku solution) Listing 8.4 checks whether a solution is valid by 
checking whether every number is valid in the board. Rewrite the program by checking
whether every row, every column, and every small box has the numbers 1 to 9.
*/
import java.util.Scanner;
public class Exercise08_24{

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
