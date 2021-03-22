package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a = 10;
        int[]arr = new int[a];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < arr.length; i++) arr[i] = str.nextInt();
        System.out.print("The distinct numbers are: ");
        lengthArr(arr);

    }
    public static void lengthArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i != j && arr[i] != 0){
                    arr[j] = 0;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}