/*
(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either X
or O). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. A draw (no winner)
occurs when all the cells on the grid have been filled with tokens and neither
player has achieved a win. Create a program for playing a tic-tac-toe game.
The program prompts two players to alternately enter an X token and O token.
Whenever a token is entered, the program redisplays the board on the console and
determines the status of the game (win, draw, or continue). Here is a sample run:

| | | |

| | | |

| | | |

Enter a row (0, 1, or 2) for player X: 1
Enter a column (0, 1, or 2) for player X: 1

| | | |
-------
| |X| | 
-------
| | | |

Enter a row (0, 1, or 2) for player O: 1
Enter a column (0, 1, or 2) for player O: 2

| | | |

| |X|O|

| | | |

Enter a row (0, 1, or 2) for player X:
. . .

|X| | |

|O|X|O|

| | |X|

X player won
*/
import java.util.Scanner;
import java.util.Arrays;
public class Exercise08_09{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String[][]game = new String[3][3];
        fill(game);
        display(game);
        while(true){
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            int column = input.nextInt();

            if(put(game, row, column, "X"))break;

            System.out.print("Enter a row (0, 1, or 2) for player 0: ");
            row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player 0: ");
            column = input.nextInt();

            if(put(game, row, column, "0"))break;
        }

    }
    public static boolean put(String[][]game, int row, int column, String token){
        game[row][column] = token;
        display(game);
        return checkDiagonal(game) || checkVH(game);
    }
    public static void fill(String[][]game){
        for (String[] strings : game) {
            Arrays.fill(strings, "E");
        }
    }

    public static boolean checkDiagonal(String[][]game){
        int countI = 0, countD = 0;
        String tokenWinI = game[0][0], tokenWinD = game[2][0];
        boolean winI = false, winD = false;
        for(int i = 0, j = 0, k = 2; i < game.length; i++, j++, k--){
            if(game[i][j].equals(tokenWinI) && !tokenWinI.equals("E")){
                countI++;
            }
            if(countI == 3){
                winI = true;
                break;
            }

            if(game[k][j].equals(tokenWinD) && !tokenWinD.equals("E")){
                countD++;
            }
            if(countD == 3){
                winD = true;
                break;
            }
        }
        if(winI)
            System.out.print(tokenWinI + " player won");
        if(winD)
            System.out.print(tokenWinD + " player won");
        return winI || winD;
    }
    //vertical and horizontal
    public static boolean checkVH(String[][]game){
        int countH = 0, countV = 0;
        String tokenWinH = " ", tokenWinV = " ";
        boolean winH = false, winV = false;
        for (int i = 0; i < game.length; i++){
            countH = 0;
            tokenWinH = game[i][0];
            //horizontal
            for (int j = 0; j < game[i].length; j++)
                if(game[i][j].equals(tokenWinH) && !tokenWinH.equals("E"))
                    countH++;

            if(countH == 3){
                winH = true;
                break;
            }
            //vertical
            tokenWinV = game[0][i];
            countV = 0;
            for (int j = 0; j < game[i].length; j++)
                if(game[j][i].equals(tokenWinV) && !tokenWinV.equals("E"))
                    countV++;

            if(countV == 3){
                winV = true;
                break;
            }
        }
        if(winH){
            System.out.print(tokenWinH + " player won");
        }
        if(winV){
            System.out.print(tokenWinV + " player won");
        }
        return winH || winV;
    }


    public static void display(String[][]game){
        System.out.println("_____________");
        for(String[]values:game){
            for(String value:values){
                System.out.print("| " + (value.equals("E") ? " ":value) + " ");
            }
            System.out.print("|\n");
            System.out.println("_____________");
        }
    }
}