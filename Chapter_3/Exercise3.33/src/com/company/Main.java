package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        str.useLocale(Locale.US);
        System.out.print("Enter weight and price for package 1: ");
        double weight = str.nextDouble();
        double num = str.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight1 = str.nextDouble();
        double num1 = str.nextDouble();
        if(num > num1){
            double res = (weight / weight1) * num1;
            if(res < num){
                System.out.print("Package 2 has a better price.");
            }
            else if(res == num){
                System.out.println("Two packages have the same price.");
            }
            else{
                System.out.print("Package 1 has a better price. ");
            }
        }
        else{
            double res = (weight1 / weight) * num;
            if(res < num){
                System.out.print("Package 2 has a better price.");
            }
            else if(res == num){
                System.out.println("Two packages have the same price.");
            }
            else{
                System.out.print("Package 1 has a better price.");
            }
        }
    }
}
