package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        boolean check = true;
        int[]arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = (int)(Math.random() * 101 + 0);
        }
        while(check){
            try{
                System.out.print("Enter an index: ");
                int index = str.nextInt();
                System.out.print("The index of array: " + arr[index]);
                check = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of Bonds");
            }

        }
    }
}
