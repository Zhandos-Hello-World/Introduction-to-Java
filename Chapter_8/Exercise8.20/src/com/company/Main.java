package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int red = 1;
        final int yellow = 2;
        int [][]saveData = new int[6][7];
        // Red player is 1  Yellow player is 2  Empty = 0
        OutputTheGame(saveData);
        while(true){
            System.out.print("Drop a red disk at column (0–6): ");
            InputData(saveData, red);
            OutputTheGame(saveData);
            int n = checkTheGame(saveData, 1);
            if(n == 1){
                System.out.print("The red player won");
                break;
            }
            System.out.print("Drop an yellow disk at column (0–6): ");
            InputData(saveData, yellow);
            OutputTheGame(saveData);
            n = checkTheGame(saveData, 2);
            if(n == 2){
                System.out.print("The yellow player won");
                break;
            }
        }
    }
    public static void InputData(int[][] saveData, int YellowOrRed){
        int e = 1;
        if(YellowOrRed == 1){
            e = 2;
        }
        Scanner str = new Scanner(System.in);
        int inputRedAndYellow = str.nextInt();
        boolean c = false;
        for(int i = saveData.length - 1; i >= 0; i--){
            if(c){
                break;
            }
            if(saveData[i][inputRedAndYellow] != YellowOrRed && saveData[i][inputRedAndYellow] != e){
                c = true;
                saveData[i][inputRedAndYellow] = YellowOrRed;
            }
        }
    }
    public static void OutputTheGame(int[][]saveData){
        for(int i = 0; i < saveData.length; i++){
            System.out.print("|");
            for(int j = 0; j < saveData[i].length; j++){
                if(saveData[i][j] == 0){
                    System.out.print(" ");
                }
                else if(saveData[i][j] == 1){
                    System.out.print("R");
                }
                else if(saveData[i][j] == 2){
                    System.out.print("L");
                }
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("———————————————");
    }
    public static int checkTheGame(int[][] values, int numberYellowOrRed){
        if(isConsecutiveFourDiagonallyL(values, numberYellowOrRed) != 0 ||
                isConsecutiveFourDiagonallyR(values, numberYellowOrRed) != 0 ||
                isConsecutiveFourHorizontal(values, numberYellowOrRed) != 0 ||
                isConsecutiveFourVertical(values, numberYellowOrRed) != 0){
            return numberYellowOrRed;
        }
        else{
            return 0;
        }
    }
    public static int isConsecutiveFourHorizontal(int[][]values, int numberYellowOrRed){
        int x = 0;
        // check to find the same number horizontally
        for(int i = 0; i < values.length; i++){
            int n = values[i][0];
            for(int j = 0; j < values[i].length; j++){
                if(n == values[i][j] && values[i][j] != 0){
                    x++;
                    if(x == 4){
                        return numberYellowOrRed;
                    }
                }
                else{
                    n = values[i][j];
                    x = 1;
                }
            }
            x = 0;
        }
        return 0;
    }
    public static int isConsecutiveFourVertical(int[][] values, int numberYellowOrRed){
        int[][]arr = new int[values[0].length][values.length];
        for(int i = 0; i < values[0].length; i++){
            for(int j = 0; j < values.length; j++){
                arr[i][j] = values[j][i];
            }
        }
        return isConsecutiveFourHorizontal(arr, numberYellowOrRed);
    }
    public static int isConsecutiveFourDiagonallyL(int[][] values, int numberYellowOrRed){
        // way to find main diagonal. To start we need to find minimal row or column
        int n = values[0][0];
        int x = 0;
        for(int i = 0; i < values.length; i++){
            if(n == values[i][i] && values[i][i] != 0){
                x++;
                if(x == 4){
                    return numberYellowOrRed;
                }
            }
            else{
                n = values[i][i];
                x = 1;
            }
        }
        int mainNumber = 1;
        while(mainNumber < values.length) {
            n = values[mainNumber][0];
            x = 0;
            for(int i = 0, j = mainNumber; j < values.length; i++, j++){
                if(n == values[j][i] && values[j][i] != 0){
                    x++;
                    if(x == 4){
                        return numberYellowOrRed;
                    }
                }
                else{
                    x = 1;
                    n = values[j][i];
                }
            }
            x = 0;
            mainNumber += 1;
        }
        mainNumber = 1;
        while(mainNumber < values.length){
            int number = values[0][mainNumber];
            int r = 0;
            for(int i = 0, j = mainNumber; i < values.length; i++, j++){
                if(j < values[i].length){
                    if(values[i][j] == number && values[i][j] != 0){
                        r++;
                        if(r == 4){
                            return numberYellowOrRed;
                        }
                    }
                    else{
                        number = values[i][j];
                        r = 1;
                    }
                }
            }
            mainNumber += 1;
        }
        return 0;
    }
    public static int isConsecutiveFourDiagonallyR(int[][] values, int numberYellowOrRed){
        int[][] arr = new int[values.length][values[0].length];
        for(int i = 0; i < arr.length; i++){
            int x = values[i].length - 1;
            for(int j = 0; j < arr[i].length; j++, x--){
                arr[i][j] = values[i][x];
            }
        }
        return isConsecutiveFourDiagonallyL(arr, numberYellowOrRed);
    }
}




