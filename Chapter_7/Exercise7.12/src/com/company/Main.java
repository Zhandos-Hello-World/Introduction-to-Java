package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [][]arr = new int[10][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        reverse(arr);
    }
    public static void reverse(int[][] arr){
        System.out.println("-------------------------------------");
        int [][]arr_2 = new int[arr.length][arr.length];
        for(int i = arr.length - 1, q = 0; i >= 0; i--, q++){
            for(int j = arr[i].length - 1, w = 0; j >= 0; j--, w++){
                System.out.print(arr[i][j] + " ");
                arr_2[q][w] = arr[i][j];
            }
            System.out.println();
        }
    }

}
