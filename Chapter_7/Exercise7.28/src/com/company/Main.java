package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.nextInt();
        }
        int n = fact(arr.length);
        int m = fact(2);
        int max = n / (fact(arr.length - m) * m);


    }


    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            int k = 1;
            for(int i = 1; i <= n; i++){
                k *= i;
            }
            return k;
        }
    }
}
