package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = str.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = str.nextInt();
        int gcd = 1;

        if(n1 > n2) {
            int temp;
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int k = n1;
        while(true){
            if(n1 % k == 0 && n2 % k== 0){
                gcd = k;
                break;
            }

            k--;
        }

        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
        }
    }

