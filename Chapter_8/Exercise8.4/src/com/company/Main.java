package com.company;

public class Main {

    public static void main(String[] args) {
	int[][]arr = {{2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
    for(int i = 0; i < arr.length; i++){
        boolean a = true;
        while(a){
            a = false;
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j - 1] < arr[i][j]){
                    int save = arr[i][j - 1];
                    arr[i][j - 1] = arr[i][j];
                    arr[i][j] = save;
                    a = true;
                }
            }
        }
    }
    System.out.println("           S M T W T F S");
    for(int i = 0; i < arr.length; i++){
        System.out.print("Employee " + i + " ");
        for(int j = 0; j < arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    }
}
