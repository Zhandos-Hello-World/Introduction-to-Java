package com.company;

public class Main {
    public static void main(String[] args) {
        final int max = 50;
        int[] arr = new int[max];
        int divisor = 2, i = 0, number = 2;
        while(i < max){
            boolean check = true;
            for(int j = divisor; j <= number; j++){
                if(number % j == 0 && j != number){
                    check = false;
                    break;
                }
            }
            if(check){
                arr[i] = number;
                i++;
            }
            number++;
        }
        int x = 0;
        for(int value : arr){
            if(x % 10 == 0){
                System.out.println();
            }
            System.out.print(value + " ");
            x++;
        }
    }
}