package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the length of the list: ");
        int a = str.nextInt();
        int []arr = new int[a];
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.nextInt();
        }
        if(isSorted(arr)){
            System.out.print("The list is already sorted");
        }
        else{
            System.out.print("The list is not sorted");
        }

    }

    public static boolean isSorted(int[] list){
        boolean a = true;
        int num = list[0];
        for(int i = 0; i < list.length; i++){
            if(num > list[i]){
                a = false;
                break;
            }
        }
        return a;
    }
}
