package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int a = str.nextInt();
        if(a >= 100 && a <= 999){
            int d_1 = a / 100;
            int d_2 = a % 10;
            if(d_1 == d_2){
                System.out.println(a + " is a palindrome");
            }
            else{
                System.out.println(a + " is not a palindrome");
            }
        }
        else{
            System.out.println("Out of range");
        }
    }
}
