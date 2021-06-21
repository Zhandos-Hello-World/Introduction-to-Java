/*
(Game: connect four) Connect four is a two-player board game in which the
players alternately drop colored disks into a seven-column, six-row vertically
suspended grid, as shown below
The objective of the game is to connect four same-colored disks in a row, a column, or a diagonal before your opponent can do likewise. The program prompts
two players to drop a red or yellow disk alternately. In the preceding figure, the
red disk is shown in a dark color and the yellow in a light color. Whenever a disk
is dropped, the program redisplays the board on the console and determines the
status of the game (win, draw, or continue). Here is a sample run:

| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |

Drop a red disk at column (0–6): 0
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|R| | | | | | |
Drop a yellow disk at column (0–6): 3
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|R| | |Y| | | |
 . . . 
 . . . 
 . . . 
Drop a yellow disk at column (0–6): 6
| | | | | | | |
| | | | | | | |
| | | |R| | | |
| | | |Y|R|Y| |
| | |R|Y|Y|Y|Y|
|R|Y|R|Y|R|R|R|

The yellow player won
*/
import java.util.Scanner;
import java.util.Arrays;
public class Exercise08_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][]values = new char[6][7];
        fill(values);
        display(values);
        while(true){
            System.out.print("Drop a red disk at column (0–6): ");
            int column = input.nextInt();
            put(values, column, 'R');
            display(values);
            if(isConsecutiveFour(values)){
                System.out.print("The red player won");
                break;
            }
            System.out.print("Drop a yellow disk at column (0–6): ");
            column = input.nextInt();
            put(values, column, 'Y');
            display(values);
            if(isConsecutiveFour(values)){
                System.out.print("The yellow player won");
                break;
            }
        }

    }
    public static void put(char[][]values, int column, char value){
        for(int i = values.length - 1; i >= 0; i--){
            if(values[i][column] == 'F'){
                values[i][column] = value;
                break;
            }
        }
    }


    public static void display(char[][]values){
        for(char[]value:values){
            for(char i:value){
                System.out.print("|" + (i == 'F' ? " ":i));
            }
            System.out.println("|");
        }
        System.out.println("_______________");
    }
    public static void fill(char[][]values){
        for (char[] value : values) {
            Arrays.fill(value, 'F');
        }
    }


    public static boolean isConsecutiveFour(char[][] values){
        //horizontal and vertical
        for (char[] value : values) {
            char num = value[0];
            char count = 0;
            for (char i : value) {
                if (num == i && i != 'F') {
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
            char num = values[0][i];
            int count = 0;
            for (char[] value : values) {
                if (num == value[i] && value[i] != 'F') {
                    count++;
                } else {
                    count = 1;
                    num = value[i];
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        //major diagonal
        for(int k = values.length - 1; k >= 0; k--){
            int count = 0;
            char num = values[k][0];
            for(int i = k, j = 0; i < values.length && j < values[0].length; i++, j++){
                if(num == values[i][j] && num != 'F'){
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
            char num = values[0][k];
            for(int i = 0, j = k; i < values.length && j < values[0].length; i++, j++){
                if(num == values[i][j] && num != 'F'){
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
            char num = values[k][0];
            for(int i = k, j = 0; i >= 0 && j < values[0].length; i--, j++){
                if(num == values[i][j] && num != 'F'){
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
            char num = values[0][k];
            for(int i = values.length - 1, j = k; i >= 0 && j < values[0].length; i--, j++){
                if(num == values[i][j] && num != 'F'){
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




