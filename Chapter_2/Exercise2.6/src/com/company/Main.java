package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int a = str.nextInt();
        int n = a / 10;
        int num_0 = a / 100;
        int num_1 = n % 10;
        int num_2 = a % 10;
        int res = num_0 + num_1 + num_2;
        System.out.print("The sum of the digits is " + res);
    }
}
