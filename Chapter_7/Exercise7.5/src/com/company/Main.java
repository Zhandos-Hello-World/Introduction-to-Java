package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int l = 10;
        int []arr = new int[l];
        for(int i = 0; i < l; i++){
            arr[i] = str.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i != j && arr[j] != 0){
                    arr[j] = 0;
                }
            }
        }
        int q = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                q++;
            }
        }
        int []arr_2 = new int[q];
        System.out.println("The number of distinct number is " + q);
        for(int i = 0 , j = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr_2[j] = arr[i];
                j++;
            }
        }
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < arr_2.length; i++){
            System.out.print(arr_2[i] + " ");
        }


    }
}
