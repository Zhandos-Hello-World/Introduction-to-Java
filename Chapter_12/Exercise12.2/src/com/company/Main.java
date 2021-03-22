package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = str.nextInt();
            System.out.print("Enter second number: ");
            int num2 = str.nextInt();
            System.out.print("Sum is " + (int)(num1 + num2));
        }
        catch (InputMismatchException e){
            System.out.print("Incorrect number: " + e);
        }
    }
}
