package com.company;

public class Main {

    public static void main(String[] args) {
        int[][]arr = new int[4][4];
        int maxColumn = 0;
        int maxRow = 0;
        int maxR = 0;
        int maxC = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 2 + 0);
            }
        }
        int x = 0;
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                x += arr[i][j];
                c += arr[j][i];
            }
            if(maxRow < x){
                maxRow = x;
                maxR = i;
            }
            if(maxColumn < c){
                maxColumn = c;
                maxC = i;
            }
            c = 0;
            x = 0;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: "  + maxR);
        System.out.println("The largest column index: " + maxC);

    }
}
