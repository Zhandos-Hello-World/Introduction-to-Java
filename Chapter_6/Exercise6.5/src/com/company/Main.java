package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = str.nextDouble();
        double num2 = str.nextDouble();
        double num3 = str.nextDouble();
        System.out.print("The sorted numbers are: ");
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 >= num2 && num2 >= num3){
            System.out.print(num3 + ", " + num2 + ", " + num1);
        }
        else if(num1 >= num3 && num3 >= num2){
            System.out.print(num2 + ", " + num3 + ", " + num1);
        }
        else if(num3 >= num2 && num2 >= num1){
            System.out.print(num1 + ", " + num2 + ", " + num3);
        }
        else if(num3 >= num1 && num1 >= num2){
            System.out.print(num2 + ", " + num1 + ", " + num3);
        }
        else if(num2 >= num1 && num1 >= num3){
            System.out.print(num3 + ", " + num1 + ", " + num2);
        }
        else if(num2 > num3 && num3 > num1){
            System.out.print(num1 + ", " + num3 + ", " + num2);
        }
    }
    }

