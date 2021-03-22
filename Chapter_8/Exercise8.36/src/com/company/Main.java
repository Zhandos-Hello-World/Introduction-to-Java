package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int rowAndColumn = str.nextInt();
        char[][] arr = new char[rowAndColumn][rowAndColumn];
        System.out.println("Enter " + rowAndColumn + " rows of letters separated by spaces: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = str.next().toUpperCase().charAt(0);
            }
        }
        if(findLatin(arr)){
            System.out.print("The input array is a Latin square");
        }
        else{
            System.out.print("Wrong input: the letters must be from A to C");
        }

    }
    public static boolean findLatin(char[][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] < 'A' || arr[i][j] > 'D'){
                    return false;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

}
