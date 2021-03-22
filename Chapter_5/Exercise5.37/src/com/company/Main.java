package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Decimal to movable: ");
        int num = str.nextInt();
        if(num!= 0 && num != 1){
            int q = 0;
            for(int i = num; i >= 1; i /= 2){
                q++;
            }
            int []arr = new int[q];
            for(int i = num, index = 0; i >= 1; i /= 2, index++){
                arr[index] = i % 2;
            }
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i]);
            }
        }
        else{
            System.out.print(num);
        }
    }
}
