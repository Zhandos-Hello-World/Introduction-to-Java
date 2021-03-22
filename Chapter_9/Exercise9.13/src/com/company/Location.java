package com.company;

public class Location {
    static int row;
    static int column;
    static double maxValue;

    public static void locateLargest(double[][] a){
        maxValue = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(maxValue < a[i][j]){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.print("The location of the largest element is " +
                maxValue + " at (" + row + ", " + column + ")");
    }
}
