package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = str.nextInt();
        System.out.print("Is 10 divisible by 5 and 6? ");
        if(a % 5 == 0 && a % 6 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.print("Is 10 divisible by 5 or 6? ");
        if(a % 5 == 0 || a % 6 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.print("Is 10 divisible by 5 or 6, but not both? ");
        if(a % 5 == 0 && a % 6 != 0){
            System.out.println("true");
        }
        else if(a % 5 != 0 && a % 6 == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
