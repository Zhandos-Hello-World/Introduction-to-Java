package com.company;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            length();
            column();
        }
        length();
        boolean check = true;
        int[][]arr = new int[3][3];
        while(check){
            InputX(arr);
            length();
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print("|");
                    if(arr[i][j] == -1 || arr[i][j] == 1){
                        if(arr[i][j] == 1){
                            System.out.print(ANSI_RED + " X " + ANSI_RESET);
                        }
                        else{
                            System.out.print(ANSI_BLUE + " 0 " + ANSI_RESET);
                        }
                    }
                    else{
                        System.out.print("   ");
                    }

                    if(j != 1 && j != 0){
                        System.out.print("|");
                    }
                }
                System.out.println();
                length();
            }
            if(Win(arr) == 3){
                System.out.print("X player won");
                break;
            }
            else if(Win(arr) == -3){
                System.out.print("O player won");
                break;
            }
            InputY(arr);
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print("|");
                    if(arr[i][j] == -1 || arr[i][j] == 1){
                        if(arr[i][j] == 1){
                            System.out.print(ANSI_RED + " X " + ANSI_RESET);
                        }
                        else{
                            System.out.print(ANSI_BLUE + " 0 " + ANSI_RESET);
                        }
                    }
                    else{
                        System.out.print("   ");
                    }

                    if(j != 1 && j != 0){
                        System.out.print("|");
                    }
                }
                System.out.println();
                length();
            }
            if(Win(arr) == 3){
                System.out.print("X player won");
                break;
            }
            else if(Win(arr) == -3){
                System.out.print("O player won");
                break;
            }
        }
    }
    public static int Win(int[][]arr){
        int number;
        if(arr[0][0] == arr[1][0] && arr[1][0] == arr[1][1]){
            number = arr[0][0];
        }
        else if(arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]){
            number = arr[0][0];
        }
        else if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
            number = arr[0][2];
        }
        else if(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]){
            number = arr[2][0];
        }
        else if(arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]){
            number = arr[0][0];
        }
        else if(arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]){
            number = arr[0][2];
        }
        else if(arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]){
            number = arr[0][1];
        }
        else if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
            number = arr[0][0];
        }
        else{
            number = - 2;
        }
        if(number == 1){
            return 3;
        }
        else if(number == -1){
            return -3;
        }
        else{
            return 32;
        }
     }
    public static void InputY(int[][]arr){
        Scanner str = new Scanner(System.in);
        boolean c = true;
        while(c){
            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            int row = str.nextInt();
            if(row > 2 || row < 0){
                boolean a = true;
                while(a){
                    System.out.println(ANSI_RED + "Try again" +ANSI_RESET);
                    System.out.print("Enter a row (0, 1, or 2) for player O: ");
                    row = str.nextInt();
                    if(row >= 0 && row <=2){
                        a = false;
                    }
                }
            }
            System.out.print("Enter a column (0, 1, or 2) for player O: ");
            int column = str.nextInt();
            if(column > 2 || column < 0){
                boolean a = true;
                while(a){
                    System.out.println(ANSI_RED + "Try again" + ANSI_RESET);
                    System.out.print("Enter a column (0, 1, or 2) for player O: ");
                    row = str.nextInt();
                    if(row >= 0 && row <=2){
                        a = false;
                    }
                }
            }
            if(arr[row][column] == 1 || arr[row][column] == -1){
                System.out.println(ANSI_RED + "Try again. Place taken" + ANSI_RESET);
            }
            else{
                arr[row][column] = -1;
                c = false;
            }
        }
    }
    public static void InputX(int[][]arr){
        Scanner str = new Scanner(System.in);
        boolean c = true;
        while(c){
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int row = str.nextInt();
            if(row > 2 || row < 0){
                boolean a = true;
                while(a){
                    System.out.println(ANSI_RED + "Try again" + ANSI_RESET);
                    System.out.print("Enter a row (0, 1, or 2) for player X: ");
                    row = str.nextInt();
                    if(row >= 0 && row <=2){
                        a = false;
                    }
                }
            }
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            int column = str.nextInt();
            if(column > 2 || column < 0){
                boolean a = true;
                while(a){
                    System.out.println(ANSI_RED + "Try again" + ANSI_RESET);
                    System.out.print("Enter a column (0, 1, or 2) for player X: ");
                    row = str.nextInt();
                    if(row >= 0 && row <=2){
                        a = false;
                    }
                }
            }
            if(arr[row][column] == 1 || arr[row][column] == -1){
                System.out.println(ANSI_RED + "Try again. Place taken" + ANSI_RESET);
            }
            else{
                arr[row][column] = 1;
                c = false;
            }
        }
    }
    public static void length(){
        System.out.println("——————-——————");
    }
    public static void column(){
        System.out.println("|   |   |   |");
    }
}
