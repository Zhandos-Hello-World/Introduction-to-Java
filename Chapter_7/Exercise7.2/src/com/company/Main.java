package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int[]arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = str.nextInt();
        }
        System.out.print("Input: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Output: ");
        for(int i = 9; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }


    }
}
