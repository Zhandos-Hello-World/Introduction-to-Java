package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][]arr1 = new int[3][3];
        int [][]arr2 = new int[3][3];
        System.out.print("Enter list1: ");
        arr1 = Input();
        System.out.print("Enter list2: ");
        arr2 = Input();

        if(equals(arr1, arr2)){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){
        boolean check = true;
        for(int i = 0; i < m1.length; i++){
            Arrays.sort(m1[i]);
            Arrays.sort(m2[i]);
        }
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                if(m1[i][j] != m2[i][j]){
                    check = false;
                }
            }
        }
        return check;
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
