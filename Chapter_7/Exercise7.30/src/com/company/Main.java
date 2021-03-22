package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = str.nextInt();
        int[]values = new int[n];
        System.out.print("Enter the values: ");
        for(int i = 0; i < n; i++){
            values[i] = str.nextInt();
        }
        if(isConsecutiveFour(values)){
            System.out.print("The list has consecutive fours");
        }
        else{
            System.out.print("The list has no consecutive fours");
        }
    }
    public static boolean isConsecutiveFour(int[] values){
        int x = 1;
        int n = values[0];
        for(int i = 0; i < values.length; i++){
            if(x == 4){
                break;
            }
            if(n == values[i]){
                x++;
            }
            else{
                x = 1;
                n = values[i];
            }
        }
        return x == 4;
    }
}
