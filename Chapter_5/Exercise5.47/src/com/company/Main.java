package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN = str.next();
        if(ISBN.length() == 12){
            int d1 = ISBN.charAt(0) - '0';
            int d2 = ISBN.charAt(1) - '0';
            int d3 = ISBN.charAt(2) - '0';
            int d4 = ISBN.charAt(3) - '0';
            int d5 = ISBN.charAt(4) - '0';
            int d6 = ISBN.charAt(5) - '0';
            int d7 = ISBN.charAt(6) - '0';
            int d8 = ISBN.charAt(7) - '0';
            int d9 = ISBN.charAt(8) - '0';
            int d10 = ISBN.charAt(9) - '0';
            int d11 = ISBN.charAt(10) - '0';
            int d12 = ISBN.charAt(11) - '0';

            int res = 10 - (d1 + 3 * d2 + d3 + 3 * d4 + d5 + 3* d6 + d7 + 3 * d8 + d9 + 3 * d10 + d11 + 3 * d12)%10;
            if(res == 10){
                res = 0;
            }
            String output = ISBN + res;
            System.out.print(output);

        }
        else{
            System.out.print(ISBN + " is an invalid input");
        }
    }
}
