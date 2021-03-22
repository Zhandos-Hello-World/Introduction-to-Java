package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = str.nextInt();
        int sum = 0;
        if(num >= 2 && num <= 10000){
            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
            if(sum == num){
                System.out.print("This is perfect number");
            }
            else{
                System.out.print("This is not perfect number");
            }
        }
    }
}
