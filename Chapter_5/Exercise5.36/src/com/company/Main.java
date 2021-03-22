package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int a = str.nextInt();
        int []arr = new int[9];
        for(int i = 100000000, index = 0; i >= 1; i/=10, index++){
            arr[index] = (a / i) % 10;
        }
        int res = 0;
        for(int i = 0, d = 1; i < 9; i++, d++){
            res += arr[i] * d;
        }
        if(res % 11 == 1) System.out.print("The ISBN-10 number is " + a);
        else System.out.println("The ISBN-10 number is " + a + "X");
    }
}
