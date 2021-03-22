package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int a = str.nextInt();
        if(a >= 1 && a <= 15){
            int e = 1;
            for(int i = 1; i <= a; i++){
                for(int j = 0; j < 3 *(a - i);j++){
                    System.out.print(" ");
                }
                for(int j = e; j > 1; j--){
                    if(j >= 10){
                        System.out.print(j + " ");
                    }
                    else{
                        System.out.print(j + "  ");
                    }
                }
                for(int j = 1; j <= e; j++){
                    if(j >= 10){
                        System.out.print(j + " ");
                    }
                    else{
                        System.out.print(j + "  ");
                    }
                }
                System.out.println();
                e++;
            }
        }
    }
}
