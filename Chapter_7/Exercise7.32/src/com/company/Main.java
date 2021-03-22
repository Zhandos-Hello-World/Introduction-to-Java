package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n = str.nextInt();
        int[]list = new int[n];
        for(int i = 0; i < list.length; i++){
            list[i] = str.nextInt();
        }

    }
    public static int partition(int[] list){

    }
}
