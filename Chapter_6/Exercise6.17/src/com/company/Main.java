package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = str.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int s =(int)(Math.random() * 2);
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
