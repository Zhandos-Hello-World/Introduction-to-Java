package com.company;
import java.util.Scanner;
public class Main {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int arr[], int n) {
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1){
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int l = 5;
        int []arr = new int[l];
        for(int i = 0 ; i < l; i++){
            arr[i] = str.nextInt();
        }
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
}