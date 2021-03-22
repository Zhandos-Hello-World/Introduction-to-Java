package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [][]arr1 = new int[3][3];
        int [][]arr2 = new int[3][3];
        System.out.print("Enter list1: ");
        arr1 = Input();
        System.out.print("Enter list2: ");
        arr2 = Input();
        boolean check = true;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                if(arr1[i][j] != arr2[i][j]){
                    check = false;
                }
            }
        }
        if(check){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
    }
    public static int[][] Input(){
        Scanner str = new Scanner(System.in);
        int[][]arr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = str.nextInt();
            }
        }
        return arr;
    }
}
