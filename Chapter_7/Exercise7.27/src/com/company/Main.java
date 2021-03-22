package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = 6;
        int[]list1 = new int[n];
        int[]list2 = new int[n];
        System.out.print("Enter list1: ");
        for(int i = 0; i < list1.length; i++){
            list1[i] = str.nextInt();
        }
        System.out.print("Enter list2: ");
        for(int i = 0; i < list2.length; i++) {
            list2[i] = str.nextInt();
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        if(equals(list1, list2)){
            System.out.print("Two lists are identical");
        }
        else{
            System.out.print("Two lists are not identical");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length == list2.length){
            boolean output = true;
            for(int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i]){
                    output = false;
                    break;
                }
            }
            return output;
        }
        else{
            return false;
        }
    }
}