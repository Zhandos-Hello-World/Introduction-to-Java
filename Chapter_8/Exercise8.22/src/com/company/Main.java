package com.company;

public class Main {
    public static void main(String[] args) {
        int [][]arr = new int[6][6];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2 + 0);
            }
        }
        System.out.println("------------");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        System.out.print("Row: { ");
        for(int i = 0; i < arr.length; i++){
            int k = 0;
            for(int j = 0; j < arr[i].length; j++){
                k += arr[i][j];
            }
            if(k % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("} are even numbers");
        System.out.print("Column: { ");
        for(int i = 0; i < arr[0].length; i++){
            int k = 0;
            for(int j = 0; j < arr.length; j++){
                k += arr[j][i];
            }
            if(k % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print("} are even numbers");
    }
}
