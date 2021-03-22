package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []arr = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100000);
        }
        int num = arr[(int)(Math.random() * 99999)];
        System.out.println(linearSearch(arr, num));
        System.out.print(BinarySearch(arr, num));
    }
    public static long linearSearch(int []list, int key){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long BinarySearch(int []list, int key){
        Arrays.sort(list);
        long startTime = System.currentTimeMillis();
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
             low = mid + 1;
             }
        long endTime = System.currentTimeMillis();
        return  endTime - startTime;
        }
 }
