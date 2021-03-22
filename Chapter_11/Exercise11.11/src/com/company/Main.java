package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i ++){
            int number = str.nextInt();
            list.add(number);
        }
        sort(list);
    }
    public static void sort(ArrayList<Integer> list){
        boolean check = true;
        int []arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        while(check){
            check = false;
            for(int i = 1; i < arr.length; i++){
                if(arr[i - 1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    check = true;
                }

            }
        }
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
