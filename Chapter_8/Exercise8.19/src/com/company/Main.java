package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter row and column: ");
        int row = str.nextInt();
        int column = str.nextInt();
        int[][]values = new int[row][column];
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values[i].length; j++){
                values[i][j] = str.nextInt();
            }
        }
        if(isConsecutiveFour(values)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    public static boolean isConsecutiveFour(int[][] values){
        return isConsecutiveFourVertical(values) || isConsecutiveFourHorizontal(values)
                || isConsecutiveFourDiagonallyL(values) || isConsecutiveFourDiagonallyR(values);
    }
    public static boolean isConsecutiveFourHorizontal(int[][]values){
        int x = 0;
        // check to find the same number horizontally
        for(int i = 0; i < values.length; i++){
            int n = values[i][0];
            for(int j = 0; j < values[i].length; j++){
                if(n == values[i][j]){
                    x++;
                    if(x == 4){
                        return true;
                    }
                }
                else{
                    n = values[i][j];
                    x = 1;
                }
            }
            x = 0;
        }
        return false;
    }
    public static boolean isConsecutiveFourVertical(int[][] values){
        int[][]arr = new int[values[0].length][values.length];
        for(int i = 0; i < values[0].length; i++){
            for(int j = 0; j < values.length; j++){
                arr[i][j] = values[j][i];
            }
        }
        return isConsecutiveFourHorizontal(arr);
    }
    public static boolean isConsecutiveFourDiagonallyL(int[][] values){
        // way to find main diagonal. To start we need to find minimal row or column
        int n = values[0][0];
        int x = 0;
        for(int i = 0; i < values.length; i++){
            if(n == values[i][i]){
                x++;
                if(x == 4){
                    return true;
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
                if(n == values[j][i]){
                    x++;
                    if(x == 4){
                        return true;
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
                    if(values[i][j] == number){
                        r++;
                        if(r == 4){
                            return true;
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
        return false;
    }
    public static boolean isConsecutiveFourDiagonallyR(int[][] values){
        int[][] arr = new int[values.length][values[0].length];
        for(int i = 0; i < arr.length; i++){
            int x = values[i].length - 1;
            for(int j = 0; j < arr[i].length; j++, x--){
                arr[i][j] = values[i][x];
            }
        }
        return isConsecutiveFourDiagonallyL(arr);
    }
}
