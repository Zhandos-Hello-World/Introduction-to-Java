package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a = str.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = str.nextInt();
        }
        System.out.println("-----------------");
        calc(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void calc(int[]arr){
        boolean f = true;
        while(f){
            f = false;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    tmp(arr, i, i-1);
                    f = true;
                }
            }
        }
    }
    private static void tmp(int[] arr, int i, int l){
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
    }
}
