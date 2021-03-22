package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 9: ");
        int a = str.nextInt();
        displayPattern(a);
    }
    public static void displayPattern(int n){
        for(int i = 1, q = n, l = 1; i <= n; i++, q--, l++){
            for(int j = 1; j <= (q - 1) * 2; j++){
                    System.out.print(" ");
            }
            for(int j = l; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
